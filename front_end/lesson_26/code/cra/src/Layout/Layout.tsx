import React, { createContext } from 'react';
import { Outlet } from 'react-router-dom';

import Navbar from '../Navbar/Navbar';

export const Context = createContext({ name: 'dafault', isAdmin: false });

function Layout(): JSX.Element {
  // eslint-disable-next-line react/jsx-no-constructed-context-values
  const user = { name: 'Ivan', isAdmin: true };
  return (
    <Context.Provider value={user}>
      <Navbar />
      <Outlet />
    </Context.Provider>
  );
}

export default Layout;
