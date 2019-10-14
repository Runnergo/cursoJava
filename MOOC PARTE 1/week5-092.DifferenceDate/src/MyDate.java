
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int diferencia = 0;
        //int diferenciaMes=0;
        //int diferenciaDia=0;
        if (!earlier(comparedDate)) {
            diferencia = this.year - comparedDate.year;

            if (this.month < comparedDate.month) {
                diferencia--;
                return diferencia;
            } else {
                if (this.month == comparedDate.month) {
                    if (this.day < comparedDate.day) {
                        diferencia--;
                    }
                }
            }
            return diferencia;

        } else {
            diferencia = comparedDate.year - this.year;
        }
        if (comparedDate.month < this.month) {
            diferencia--;
            return diferencia;
        } else {
            if (comparedDate.month == this.month) {
            }
            if (comparedDate.day < this.day) {
                diferencia--;
                return diferencia;
            }
       
        }
        return diferencia;
    }
}
