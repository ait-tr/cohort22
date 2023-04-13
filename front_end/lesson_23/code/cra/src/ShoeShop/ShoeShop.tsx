import React, { useEffect, useState } from 'react';
import ShoesCard from '../ShoesCard/ShoesCard';
import { Shoes } from './types/Shues';

function ShoeShop(): JSX.Element {
  const [shoes, setShoes] = useState<Shoes[]>([]);
  useEffect(() => {
    async function loadShoes(): Promise<void> {
      const response = await fetch('https://alisherkhamidov.github.io/temp_cinema_api/shoes.json');
      const obj = await response.json();
      console.log(obj.products);
      setShoes(obj.products);
    }
    loadShoes();
  }, []);
  return (
    <div>
      <ul>
        {shoes.map((element) => (
          <ShoesCard shoesObj={element} />
        )
        )}
      </ul>
    </div>
  );
}

export default ShoeShop;
