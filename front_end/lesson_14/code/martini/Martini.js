import Alcohol from "./Alcohol";

class Martini extends Alcohol {
  constructor(isRed, title, volume, strenght) {
    super(title, volume, strenght);
    this.isRed = isRed;
  }
}

export default Martini;