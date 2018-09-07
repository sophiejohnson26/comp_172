package sample;

public class PrintJobb {
        private String color;
        private String paperType;
        private String sided;
        private int numPages;
        private double costPerPage;
        private double totalCost;

        public PrintJobb(String colorIn, String paperTypeIn, String sidedIn, int numPagesIn) {
            this.color = colorIn;
            this.paperType = paperTypeIn;
            this.sided = sidedIn;
            this.numPages = numPagesIn;
            this.costPerPage = 0.0D;
            this.totalCost = 0.0D;
        }

        public void determineCostPerPage() {
            if (this.color.equalsIgnoreCase("Grayscale")) {
                this.costPerPage += 0.1D;
            } else if (this.color.equalsIgnoreCase("P1")) {
                this.costPerPage += 0.3D;
            } else if (this.color.equalsIgnoreCase("P2")) {
                this.costPerPage += 0.45D;
            } else {
                this.costPerPage += 0.65D;
            }

            if (this.sided.equalsIgnoreCase("Both")) {
                this.costPerPage *= 2.0D;
            }

            if (this.paperType.equalsIgnoreCase("Matte")) {
                this.costPerPage += 0.05D;
            } else {
                this.costPerPage += 0.1D;
            }

        }

        public void determineTotalCost() {
            this.totalCost = this.costPerPage * (double)this.numPages;
        }

        public double getCostPerPage() {
            return this.costPerPage;
        }

        public double getTotalCost() {
            return this.totalCost;
        }
    }

