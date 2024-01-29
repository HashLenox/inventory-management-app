-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2023 at 04:54 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Table structure for table `jd`
--

CREATE TABLE `jd` (
  `id` int(11) NOT NULL,
  `iduser` varchar(11) NOT NULL,
  `usename` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jd`
--

INSERT INTO `jd` (`id`, `iduser`, `usename`, `password`, `role`, `name`) VALUES
(51, '11', 'admin', 'admin', 'admin', 'admin'),
(53, '3', 'user', 'user', 'user', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `OrderID` int(255) NOT NULL,
  `ProductID` varchar(60) NOT NULL DEFAULT 'Not Defind',
  `Quntity` int(255) NOT NULL,
  `OrderDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`OrderID`, `ProductID`, `Quntity`, `OrderDate`) VALUES
(12, 'TV', 30, '2023-12-29'),
(14, 'TV', 30, '2023-12-29'),
(23, 'TV', 10, '2023-12-28'),
(43, 'TV', 1, '2023-12-30');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(255) NOT NULL,
  `ProductID` varchar(234) NOT NULL,
  `ProductName` varchar(255) NOT NULL,
  `Quntity` int(255) NOT NULL,
  `ProductCatgory` varchar(244) NOT NULL,
  `Price` decimal(10,2) NOT NULL,
  `suppliername` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `ProductID`, `ProductName`, `Quntity`, `ProductCatgory`, `Price`, `suppliername`) VALUES
(7, '90', 'LCD TV', 2, 'Electronic', 5000.00, 'Samsung Sri Lanka'),
(8, '56', 'fgdfgdfg', 99, 'Electronic', 4545.00, 'Samsung Sri Lanka'),
(9, '44', 'hfghgf', 565, 'Electronic', 67867.00, 'Samsung Sri Lanka'),
(10, '24', 'IPhone 16 Pro Max', 31, 'Electronic', 32000.00, 'Apple');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id` int(255) NOT NULL,
  `supplierid` varchar(100) NOT NULL,
  `name` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `supplierid`, `name`, `contact`, `phone`, `email`) VALUES
(1, 'EL 100', 'Samsung Sri Lanka', '0112343456', '0112343456', 'samsung@gmail.com'),
(8, '808', 'Apple', '011234567', '098423345', 'contact@apple.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jd`
--
ALTER TABLE `jd`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`OrderID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jd`
--
ALTER TABLE `jd`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `OrderID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
