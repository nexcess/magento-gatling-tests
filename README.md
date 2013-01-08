Magento Gatling Tests
=====================

This is a scenario for stress-testing a Magento store using [gatling](http://gatling-tool.org/). The scenario simulates two types of users: "buyers" and "browsers". 

* *buyers* - Navigate to the home page -> category page -> product page; add product to cart; view cart; proceed through checkout as a guest. These represent shoppers, and add additional backend load to the test. For the time being, all buyers purchase the same product. 
* *browsers* - Navigate to the home page -> category page -> category page -> product page. These represent anonymous visitors. Categories and products are chosen at random from a csv containing all of the catalog urls. 

Requirements
------------

* A site running Magento Enterprise Edition.
* 100k sku catalog sample data.

Usage
-----

1. Download and extract [gatling](http://gatling-tool.org/). 
2. Clone this repo into the gatling root directory.
3. Run `gatling.sh` to choose and initiate a simulation.
4. Results will appear in <gatling-root>/results as auto-generated HTML/JavaScript pages. A web server will be useful if you want to view these results. 
