
package tp.practicas;

import java.util.Objects;

public abstract class Resource {

    private String code;
    private String title;

    public Resource(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o instanceof Resource r) {
            if (this.code.equals(r.code)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return String.format("[%s] - %s", this.code, this.title);
    }
}

