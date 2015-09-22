package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class SearchByCode {

	public static void main(String[] args) {
		List<Region> regions = createRegions();

		System.out.println(searchCityByCodeFromRegionOld(regions.get(0), "WAW"));
		System.out.println(searchCityByCodeFromRegionNew(regions.get(0), "WAW"));
		

		
		BiFunction<Region, String, String> searchOther = (region,code) -> {
			return region.getCities().stream()
					.map(v -> v.orElse(null))
					.filter(v -> v != null)
					.filter(c -> code.equals(c.getCode()))
					.map(c -> c.getName())
					.findFirst().orElse(null);
		};
		System.out.println(searchOther.apply(regions.get(0), "WAW"));
	}

	private static String searchCityByCodeFromRegionNew(Region region, String code) {
		for (Optional<City> city : region.getCities()) {
			if (city.isPresent() && code.equals(city.get().getCode())) {
				return city.get().getName();
			}
		}
		return null;
	}

	private static String searchCityByCodeFromRegionOld(Region region, String code) {
		return region.getCities().stream()
								.map(v -> v.orElse(null))
								.filter(v -> v != null)
								.filter(c -> code.equals(c.getCode()))
								.map(c -> c.getName())
								.findFirst().orElse(null);

	}

	private static List<Region> createRegions() {	
		List<Region> res = new ArrayList<Region>();
		
		List<Optional<City>> citiesMaz = new ArrayList<>();
		List<Optional<City>> citiesSla = new ArrayList<>();
		
		citiesMaz.add(Optional.of(new City("Warszawa", "WAW")));
		citiesMaz.add(Optional.of(new City("Piasek", "PIA")));
		
		citiesSla.add(Optional.of(new City("Katowice", "KTW")));
		
		Region r1 = new Region(citiesMaz, "MAZ");
		Region r2 = new Region(citiesSla, "SLA");
		Collections.addAll(res, r1, r2);
		return res;
	}
}

class City {

	private String name;
	private String code;

	public City(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}

class Region {

	private List<Optional<City>> cities;
	private String name;

	public Region(List<Optional<City>> cities, String name) {
		super();
		this.cities = cities;
		this.name = name;
	}

	public List<Optional<City>> getCities() {
		return cities;
	}

	public void setCities(List<Optional<City>> cities) {
		this.cities = cities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}