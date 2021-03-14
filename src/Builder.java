public class Builder {
    public class House {
        private int walls, doors, windows;
        private boolean hasGarage, hasGarden, hasGym, hasPlayroom;

        public House(HouseBuilder houseBuilder) {
        }

        public class HouseBuilder {
            private int walls, doors, windows;
            private boolean hasGarage, hasGarden, hasGym, hasPlayroom;
            public HouseBuilder(int walls, int doors, int windows) {
                this.walls = walls;
                this.doors = doors;
                this.windows = windows;
            }
            public HouseBuilder Garage(boolean hasGarage) {
                this.hasGarage = hasGarage;
                return this;
            }
            public HouseBuilder Garden(boolean hasGarden) {
                this.hasGarden = hasGarden;
                return this;
            }
            public HouseBuilder Gym( boolean hasGym) {
                this.hasGym = hasGym;
                return this;
            }
            public HouseBuilder Playroom( boolean hasPlayroom) {
                this.hasPlayroom = hasPlayroom;
                return this;
            }
            public House build() {
                return new House(this);
            }
        }
    }
}
