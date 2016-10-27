$(document).ready(function(){
//lowstocklimit
	$(".edit_lowlimit").click(function(){
	//hide this stuff
		$(".stocklowlimit").hide();
		$(".edit_lowlimit").hide();
	//show this stuff
		$(".updatestocklowlimit").show();
		$(".save_lowlimit").show();
		$(".cancel_lowlimit").show();
	});
	$(".save_lowlimit").click(function(){
	//hide this stuff
		$(".updatestocklowlimit").hide();
		$(".save_lowlimit").hide();
		$(".cancel_lowlimit").hide();
	//show this stuff
		$(".stocklowlimit").show();
		$(".edit_lowlimit").show();
	});
	$(".cancel_lowlimit").click(function(){
	//hide this stuff
		$(".updatestocklowlimit").hide();
		$(".save_lowlimit").hide();
		$(".cancel_lowlimit").hide();
	//show this stuff
		$(".stocklowlimit").show();
		$(".edit_lowlimit").show();
	});
//stocklevel
	$(".edit_stocklevel").click(function(){
	//hide this stuff
		$(".stocklevel").hide();
		$(".edit_stocklevel").hide();
	//show this stuff
		$(".update_stocklevel").show();
		$(".save_stocklevel").show();
		$(".cancel_stocklevel").show();
	});
	$(".save_stocklevel").click(function(){
	//hide this stuff
		$(".update_stocklevel").hide();
		$(".save_stocklevel").hide();
		$(".cancel_stocklevel").hide();
	//show this stuff
		$(".stocklevel").show();
		$(".edit_stocklevel").show();
	});
	$(".cancel_stocklevel").click(function(){
	//hide this stuff
		$(".update_stocklevel").hide();
		$(".save_stocklevel").hide();
		$(".cancel_stocklevel").hide();
	//show this stuff
		$(".stocklevel").show();
		$(".edit_stocklevel").show();
	});
//price
	$(".edit_price").click(function(){
	//hide this stuff
		$(".price").hide();
		$(".edit_price").hide();
	//show this stuff
		$(".update_price").show();
		$(".save_price").show();
		$(".cancel_price").show();
	});
	$(".save_price").click(function(){
		//hide this stuff
		$(".update_price").hide();
		$(".save_price").hide();
		$(".cancel_price").hide();
	//show this stuff
		$(".price").show();
		$(".edit_price").show();
	});
	$(".cancel_price").click(function(){
		//hide this stuff
		$(".update_price").hide();
		$(".save_price").hide();
		$(".cancel_price").hide();
	//show this stuff
		$(".price").show();
		$(".edit_price").show();
	});
//description
	$(".edit_desc").click(function(){
	//hide this stuff
		$(".showdescription").hide();
		$(".edit_desc").hide();
	//show this stuff
		$(".editdescription").show();
		$(".save_desc").show();
		$(".cancel_desc").show();
	});
	$(".save_desc").click(function(){
	//hide this stuff
		$(".editdescription").hide();
		$(".save_desc").hide();
		$(".cancel_desc").hide();
	//show this stuff
		$(".showdescription").show();
		$(".edit_desc").show();
	});
	$(".cancel_desc").click(function(){
	//hide this stuff
		$(".editdescription").hide();
		$(".save_desc").hide();
		$(".cancel_desc").hide();
	//show this stuff
		$(".showdescription").show();
		$(".edit_desc").show();
	});
});