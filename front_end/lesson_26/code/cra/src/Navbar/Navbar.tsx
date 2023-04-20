import React from 'react';
import { useNavigate } from 'react-router-dom';
import Button from '../Button/Button';

function Navbar(): JSX.Element {
  const navigate = useNavigate();
  function handleCounterClick(): void {
    navigate('/counter');
  }
  // такая же функция, но стрелочная
  const handleGenderClick = (): void => {
    navigate('/gender');
  };
  function handleBackClick(): void {
    navigate(-1);
  }
  function handleHomeClick(): void {
    navigate('/');
  }
  function handleCinemaClick(): void {
    navigate('/cinema');
  }
  function handleShoesClick():void {
    navigate('/shoeshop');
  }
  function handleBootstrapClick():void {
    navigate('/bootstrap');
  }

  return (
    <div>
      <button type="button" onClick={handleBackClick}> 🔙 </button>
      <button type="button" onClick={handleCounterClick}>Каунтер</button>
      <button type="button" onClick={handleGenderClick}>Определитель пола</button>
      <button type="button" onClick={handleHomeClick}>Home</button>
      <button type="button" onClick={handleCinemaClick}>Cinema</button>
      <button type="button" onClick={handleShoesClick}>Shoes Shop</button>
      <button type="button" onClick={handleBootstrapClick}>Bootstrap</button>
      <Button message=" информации" />
      <Button message=" фидбека" />
    </div>
  );
}

export default Navbar;
