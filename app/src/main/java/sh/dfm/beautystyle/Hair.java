package sh.dfm.beautystyle;


public class Hair {
    private String name;
    private String description;
    private int imageResoutceId;

    public Hair(String name, String description, int imageResoutceId) {
        this.name = name;
        this.description = description;
        this.imageResoutceId = imageResoutceId;
    }

    public int getImageResoutceId() {
        return imageResoutceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static final Hair[] hairs ={
            new Hair("Классика",
                    "Классические стрижки характеризуются четкой геометрией линий. Длина волос при этом обычно не более 3-5 см. Подобные укладки предполагают гладко зачесанную шевелюру с пробором или без него. Они требуют минимального ухода и никогда не теряют актуальности.",
                    R.drawable.hair1),
            new Hair("Спортивный стиль",
                    "Спортивные прически уже давно носят не только спортсмены. Они подходят к любой одежде, будь то повседневный или деловой костюм. Их отличает небольшая длина волос по всей голове с объемом наверху. Возрастных ограничений для такой прически также нет.",
                    R.drawable.hair2),
            new Hair("Милитари",
                    "Укладки «Милитари» нередко выполняются на волосах средней длины. Их вид несколько небрежен за счет того, что основой выступают многоступенчатые стрижки. Стиль «Милитари» хорош и для зрелых, и для молодых мужчин. Он подчеркивает сильный характер обладателя такой прически.",
                    R.drawable.hair3)

    };
}
