package menu.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import menu.util.ResourcesReader;

public enum Category {
    JAPAN("일식", "src/main/resources/japan.md", 1),
    KOREA("한식", "src/main/resources/korea.md", 2),
    CHINA("중식", "src/main/resources/china.md", 3),
    ASIAN("아시안", "src/main/resources/asian.md", 4),
    WESTERN("양식", "src/main/resources/western.md", 5);

    private final String name;

    private final String filePath;

    private final Integer index;

    public static List<String> getCategoryWithMenus(Category category, ResourcesReader resourcesReader) {
        return resourcesReader.readResource(category.filePath);
    }

    public static Category getCategoryByIndex(int index) {
        return Arrays.stream(Category.values())
                .filter(category -> index == category.index)
                .findFirst()
                .orElseThrow();
    }

    public static String getCategoryNames(List<Category> categories) {
        List<String> categoryNames = categories.stream().map(category -> category.name).collect(Collectors.toList());
        return "[ 카테고리 | " + String.join(" | ", categoryNames) + " ]\n";
    }


    Category(String name, String filePath, Integer index) {
        this.name = name;
        this.filePath = filePath;
        this.index = index;
    }

}
