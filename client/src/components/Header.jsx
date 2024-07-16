const Header = () => {
    return (
        <div className='flex items-center justify-between'>

            <div className='flex '>
                <img className='h-20 w-[60px]' src="./images/logo.png" alt="logo" />
            </div>

            <ul className='lg:flex gap-14 hidden'>
                <li className='text-white text-xl'>Home</li>
                <li className='text-white text-xl'>About</li>
                <li className='text-white text-xl'>Features</li>
                <li className='text-white text-xl'>Contact</li>
            </ul>

            <img src="./images/cart.png" alt="cart" className='h-12'/>

        </div>
    )
}

export default Header;