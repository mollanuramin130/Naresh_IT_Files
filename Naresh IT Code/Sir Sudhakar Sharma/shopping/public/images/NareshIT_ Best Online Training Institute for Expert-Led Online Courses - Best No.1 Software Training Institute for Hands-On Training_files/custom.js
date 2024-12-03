var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
(function ($) {

  "use strict";

  // MENU
  $('.navbar-collapse a')
    .on('click', function () {
      $(".navbar-collapse")
        .collapse('hide');
    });

  AOS.init({
    duration: 800,
    easing: 'slide',
    once: true
  });


  // CUSTOM LINK
  $('.smoothscroll')
    .click(function () {
      var el = $(this)
        .attr('href');
      var elWrapped = $(el);
      var header_height = $('.navbar')
        .height();

      scrollToDiv(elWrapped, header_height);
      return false;

      function scrollToDiv(element, navheight) {
        var offset = element.offset();
        var offsetTop = offset.top;
        var totalScroll = offsetTop - 0;

        $('body,html')
          .animate({
            scrollTop: totalScroll
          }, 300);
      }
    });


})(window.jQuery);
/*banner text animation js*/
(function ($) {


  var factList = [
    " in Demand skills. ",
    "innovative concepts.",
    " & Updated Technoglies. ",
    " AI concepts."


  ];


  var perRow = factList.length;
  console.log("perRow = " + perRow)
  var radius = perRow * 6;
  var angle = 360 / perRow;
  console.log("Angle = " + angle);
  var n = 1;

  var height = $('h1')
    .css('height');

  function create_row() {
    for (i = 0; i < perRow; i++) {
      $('.factlist')
        .append('<li class="fact-' + i + '">' + factList[i] + '</li>');
      $('.fact-' + i + '')
        .css({
          '-webkit-transform': 'rotate(' + -angle * i + 'deg)',
          '-moz-transform': 'rotate(' + -angle * i + 'deg)'
        });
    }
  };

  create_row();


  setInterval(function () {
    $('.factlist')
      .css({
        '-webkit-transform': 'rotate(' + angle * n + 'deg)',
        '-moz-transform': 'rotate(' + angle * n + 'deg)'
      });
    n++;
  }, 2000);

})(window.jQuery);

$(document).ready(function () {


  /* ==========================================
  scrollTop() >= 300
  Should be equal the the height of the header
  ========================================== */

  $(window).scroll(function () {
    if ($(window).scrollTop() >= 300) {

      $('.navbar').addClass('fixed-header');
      $('.navbar div').addClass('visible-title');
    }
    else {
      $('nav').removeClass('fixed-header');
      $('nav div').removeClass('visible-title');
    }
  });


  /*-------------------------------*/
  /*    HOMEPAGE SLIDERS STARTS    */
  /*-------------------------------*/


  if ($(".homepage-main-banner-slider-mobile").length > 0) {
    tns({
      container: ".homepage-main-banner-slider-mobile",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 0,
      nav: false,
      gutter: 0,
      autoplay: true,
      autoplayButtonOutput: false,
      controlsContainer: "#homepage-main-banner-slider-mobile-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 1
        },
        600: {
          items: 1
        },
        900: {
          items: 1
        }
      }

    });
  }


  if ($(".homepage-main-banner-slider").length > 0) {
    tns({
      container: ".homepage-main-banner-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 0,
      nav: false,
      gutter: 0,
      autoplay: true,
      autoplayButtonOutput: false,
      controlsContainer: "#homepage-main-banner-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 1
        },
        600: {
          items: 1
        },
        900: {
          items: 1
        }
      }

    });
  }

  /*newlylaunch courses slider*/
  if ($(".newly-launch-courses-slider").length > 0) {
    tns({
      container: ".newly-launch-courses-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#newly-launch-courses-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 4
        }
      }

    });
  }

  /*Trending Courses*/
  /* fullstack courses slider updated*/



  /* fullstack courses slider*/
  if ($(".full-stack-courses-slider-new").length > 0) {
    const certificateSlider = tns({
      container: ".full-stack-courses-slider-new",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 32,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#full-stack-courses-slider-new-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 4
        }
      }

    });
  }
  /* Placement guarantee slider*/
  if ($(".placement-guarantee-course-slider").length > 0) {
    const placementGuaranteeCourseSlider = tns({
      container: ".placement-guarantee-course-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 30,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#placement-guarantee-course-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 4
        }
      }

    });
  }

  /*domains Slider*/

  if ($(".domains-slider").length > 0) {
    const jobPlacementSlider = tns({
      container: ".domains-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#domains-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 5
        }
      }

    });
  }

  /*Placed Students*/
  if ($(".job-placement-slider").length > 0) {
    const jobPlacementSlider = tns({
      container: ".job-placement-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 32,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#job-placement-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 5
        }
      }

    });
  }

  if ($(".blogs-slider").length > 0) {
    const blogsSlider = tns({
      container: ".blogs-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 32,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#blogs-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });


  }

  if ($(".companies-slider").length > 0) {
    const blogsSlider = tns({
      container: ".companies-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 10,
      nav: false,
      gutter: 10,
      autoplay: true,
      autoplayButtonOutput: false,
      controlsContainer: "#companies-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 4
        },
        900: {
          items: 6
        }
      }

    });


  }


  /*domains Slider*/

  if ($(".course-listing-slider").length > 0) {
    const jobPlacementSlider = tns({
      container: ".course-listing-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#course-listing-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });
  }

  if ($(".dynamic-course-listing-slider").length > 0) {
    const jobPlacementSlider = tns({
      container: ".dynamic-course-listing-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#dynamic-course-listing-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });
  }






  /*-------------------------------*/
  /*    HOMEPAGE SLIDERS END       */
  /*-------------------------------*/









  /* COURSE DEAIL PAGE*/
  if ($(".course-detail-page-placements-slider").length > 0) {
    const courseDetailPageReviewsSlider = tns({
      container: ".course-detail-page-placements-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 32,
      nav: false,
      gutter: 32,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#course-detail-page-placements-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });


  }

  if ($(".course-detail-page-reviews-slider").length > 0) {
    const courseDetailPageReviewsSlider = tns({
      container: ".course-detail-page-reviews-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 30,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#course-detail-page-reviews-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });


  }

  if ($(".relevant-courses-list-slider").length > 0) {
    const relevantCoursesListSlider = tns({
      container: ".relevant-courses-list-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 30,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#relevant-courses-list-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 4
        }
      }

    });


  }

  if ($(".job-placement-course-list-slider").length > 0) {
    const jobPlacementCourseListSlider = tns({
      container: ".job-placement-course-list-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 30,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#job-placement-course-list-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 5
        }
      }

    });
  }

  /*enroll courses detail page*/

  if ($(".enroll-course-video-slider").length > 0) {
    const enrollCourseVideoSlider = tns({
      container: ".enroll-course-video-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 30,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#enroll-course-video-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });
  }

  /* nasscom slider*/

  if ($(".nasscom-courses-list-slider").length > 0) {
    const blogRelevantCoursesListSlider = tns({
      container: ".nasscom-courses-list-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 10,
      nav: false,
      gutter: 10,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#nasscom-courses-list-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 4
        }
      }

    });


  }

  /* full stack course slider*/

  if ($(".full-stack-courses-list-slider").length > 0) {
    const blogRelevantCoursesListSlider = tns({
      container: ".full-stack-courses-list-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 10,
      nav: false,
      gutter: 10,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#full-stack-courses-list-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 4
        }
      }

    });


  }


  /* DASHBOARD PAGE*/
  if ($(".blogs-slider-dashboard").length > 0) {
    const blogsSliderDashboard = tns({
      container: ".blogs-slider-dashboard",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 30,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#blogs-slider-dashboard-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });


  }

  /* Blog SINGLE PAGE*/

  if ($(".blog-relevant-courses-list-slider").length > 0) {
    const blogRelevantCoursesListSlider = tns({
      container: ".blog-relevant-courses-list-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 10,
      nav: false,
      gutter: 10,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#blog-relevant-courses-list-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 4
        }
      }

    });


  }

  if ($(".recently-blogs-slider").length > 0) {
    const recentlyBlogsSlider = tns({
      container: ".recently-blogs-slider",
      mouseDrag: true,
      items: 1,
      axis: "horizontal",
      swipeAngle: false,
      speed: 700,
      edgePadding: 30,
      nav: false,
      gutter: 30,
      autoplay: false,
      autoplayButtonOutput: false,
      controlsContainer: "#recently-blogs-slider-controls",
      responsive: {
        350: {
          items: 1
        },

        500: {
          items: 2
        },
        600: {
          items: 3
        },
        900: {
          items: 3
        }
      }

    });


  }

  /*news*/

  (function ($) {
    $.fn.countTo = function (options) {
      options = options || {};

      return $(this).each(function () {
        // set options for current element
        var settings = $.extend({}, $.fn.countTo.defaults, {
          from: $(this).data('from'),
          to: $(this).data('to'),
          speed: $(this).data('speed'),
          refreshInterval: $(this).data('refresh-interval'),
          decimals: $(this).data('decimals')
        }, options);

        // how many times to update the value, and how much to increment the value on each update
        var loops = Math.ceil(settings.speed / settings.refreshInterval),
          increment = (settings.to - settings.from) / loops;

        // references & variables that will change with each update
        var self = this,
          $self = $(this),
          loopCount = 0,
          value = settings.from,
          data = $self.data('countTo') || {};

        $self.data('countTo', data);

        // if an existing interval can be found, clear it first
        if (data.interval) {
          clearInterval(data.interval);
        }
        data.interval = setInterval(updateTimer, settings.refreshInterval);

        // initialize the element with the starting value
        render(value);

        function updateTimer() {
          value += increment;
          loopCount++;

          render(value);

          if (typeof (settings.onUpdate) == 'function') {
            settings.onUpdate.call(self, value);
          }

          if (loopCount >= loops) {
            // remove the interval
            $self.removeData('countTo');
            clearInterval(data.interval);
            value = settings.to;

            if (typeof (settings.onComplete) == 'function') {
              settings.onComplete.call(self, value);
            }
          }
        }

        function render(value) {
          var formattedValue = settings.formatter.call(self, value, settings);
          $self.html(formattedValue);
        }
      });
    };

    $.fn.countTo.defaults = {
      from: 0,               // the number the element should start at
      to: 0,                 // the number the element should end at
      speed: 1000,           // how long it should take to count between the target numbers
      refreshInterval: 100,  // how often the element should be updated
      decimals: 0,           // the number of decimal places to show
      formatter: formatter,  // handler for formatting the value before rendering
      onUpdate: null,        // callback method for every time the element is updated
      onComplete: null       // callback method for when the element finishes updating
    };

    function formatter(value, settings) {
      return value.toFixed(settings.decimals);
    }
  }(jQuery));

  jQuery(function ($) {
    // custom formatting example
    $('.count-number').data('countToOptions', {
      formatter: function (value, options) {
        return value.toFixed(options.decimals).replace(/\B(?=(?:\d{3})+(?!\d))/g, ',');
      }
    });

    // start all the timers
    $('.timer').each(count);

    function count(options) {
      var $this = $(this);
      options = $.extend({}, options || {}, $this.data('countToOptions') || {});
      $this.countTo(options);
    }
  });

  /********************Batch list***************************/

  




  let newBatches = []

  $('.type').click(function () {
    const id = $(this).data('id');
    fetchBatchList(id)
  });

  function fetchBatchList(id) {
    $.ajax({
      type: "GET",
      url: '/get-batchlist/' + id,
      cache: false,
      contentType: false,
      processData: false,
      success: function (data) {
        console.log(data,'daaaaaaaaaaaaaaaaaaaataaaaaaaaaaaaaaaaa')
        const data1 = data.batch_list
        newBatches = data.batch_list
        renderTable(data1,30)

      },
      error: function () {
        console.log('Something went wrong')
      },
    })
  }


  // function renderTable(data1, entriesToShow){
  //   var tableBody = $('#datatablesSimple tbody');

  //       tableBody.empty();
  //       if (data1.length === 0) {
  //         // If data1 is empty, show "No entries found" message
  //         tableBody.append(`
  //             <tr>
  //               <td class="datatable-empty" colspan="6">No entries found</td>
  //             </tr>
  //           `);
  //       } else {
  //         for (let i = 0; i < entriesToShow && i < data1.length; i++) {
  //           const item = data1[i];
  //           tableBody.append(`
  //               <tr>
  //                   <td class="srno_column">${i + 1}</td>
  //                   <td class="course_column"> ${item.course_name}</td>
  //                   <td class="faculty_column">${item.faculty_name}</td>
  //                   <td class="date_column">${formatDate(item?.start_date_time)}</td>
  //                   <td class="time_column">${formateTime(item?.start_date_time)}</td>
  //                   <td class="meeting_column"><a target="_blank" href="${item.meeting_link}" ><button type="button" class="btn btn-outline-primary btn-sm">Click here</button></a></td>
  //               </tr>
  //           `);
  //       }
  //       }
  // }

  function renderTable(data1, entriesToShow) {
    // var table = $('#datatablesSimple').DataTable();
    // table.clear().draw();
    // for (let i = 0; i < data1.length; i++) {
    //   const item = data1[i];
    //   table.row.add([
    //     i + 1, 
    //     item.course_name,
    //     item.faculty_name,
    //     formatDate(item?.start_date_time),
    //    ( formateTime(item?.start_date_time)),
    //     `<a target="_blank" href="${item.meeting_link}"><button type="button" class="btn btn-outline-primary btn-sm">Click here</button></a>`
    //   ]).draw(false);
    // }
    
   
    // table.page.len(entriesToShow).draw();


//     var table = $('#datatablesSimple').DataTable();
// table.clear().draw();

// // Arrays of classes for each column
// const columnClasses = [
// 'srno_column',
// 'course_column',
// 'faculty_column',
// 'date_column',
// 'time_column',
// 'meeting_column'
// ]; // Add as many classes as needed, one for each column

// // Add column headers
// table.columns().header().each(function(columnHeader, index) {
// $(columnHeader).addClass(columnClasses[index]);
// });

// for (let i = 0; i < data1.length; i++) {
// const item = data1[i];
// table.row.add([
//   `<span class="${columnClasses[0]}">${i + 1}</span>`
// ,
// `<span class="${columnClasses[1]}">${item.course_name}</span>`,
// `<span class="${columnClasses[2]}">${item.faculty_name}</span>`,
// `<span class="${columnClasses[3]}">${formatDate(item?.start_date_time)}</span>`,
// `<span class="${columnClasses[4]}">${formateTime(item?.start_date_time)}</span>`,
// `<a target="_blank" href="${item.meeting_link}"><button type="button" class="${columnClasses[5]} btn btn-outline-primary btn-sm">Click here</button></a>`
// ]).draw(false);
// }


var table = $('#datatablesSimple').DataTable();
table.clear().draw();

// Arrays of classes for each column
const columnClasses = [
  'srno_column',
  'course_column',
  'faculty_column',
  'date_column',
  'time_column',
  'meeting_column'
]; // Add as many classes as needed, one for each column

// Add column headers
table.columns().header().each(function(columnHeader, index) {
  $(columnHeader).addClass(columnClasses[index]);
});
console.log('entriesToShowentriesToShow',entriesToShow)
  for (let i = 0; i < data1.length && i < entriesToShow ; i++) {
    const item = data1[i];
    console.log(item,'itemmmmmmmmmmmmmmm')
    const rowData = [
      i + 1,
      item.course_name,
      item.faculty_name,
      (item?.start_date_time),
      formateTime(item?.start_date_time)+' (IST)',
      `<a target="_blank" href="${item.meeting_link}"><button type="button" class=" btn btn-outline-primary btn-sm">Click here</button></a>`
    ];

    const rowNode = table.row.add(rowData).node();
    $(rowNode).children('td').each(function(columnIndex) {
      $(this).addClass(columnClasses[columnIndex]);
    });
    $(rowNode).addClass(i % 2 === 0 ? 'ash' : 'white');
  }

  table.draw(false);   
    
}
    
   


$('#entriesSelect').on('change', function () {
  const selectedEntries = parseInt($(this).val(), 10);
  console.log(selectedEntries,'selectedEntries')
  console.log(selectedEntries)
  renderTable(newBatches, selectedEntries);
});


$('#searchInput').on('input', function () {
  const searchTerm = $(this).val().toLowerCase().trim();
  const filteredData = newBatches.filter(item => {
      return (
          item.course_name.toLowerCase().includes(searchTerm) ||
          item.faculty_name.toLowerCase().includes(searchTerm)
      );
  });
  
  const defaultEntriesToShow = 30;
  renderTable(filteredData,defaultEntriesToShow); // Update the table with the filtered data
});





  /***********************SIGN UP BUTTON***************************/
  $("body").on("click", "#sign-up-btn", function (event) {
    event.preventDefault();

    var name_flag = false;
    var mobile_flag = false;
    var email_flag = false;
    var check_flag = false;
    let source = $('#source').val();
    var name = $("#fullName").val().trim();
    let email = $("#email").val().trim();
    let mobile = $("#mobile").val().trim();


    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (name == '') {
      $("#fullName").addClass("is-invalid");
      $(".error_name").text("Name is required *");
      name_flag = false;
    } else {

      if (name.length < 3 || !/^[a-zA-Z\s]*$/.test(name)) {
        $("#fullName").addClass("is-invalid");
        $(".error_name").text("Please enter a valid name (minimum 3 characters, only letters and spaces).");
        name_flag = false;
      } else {
        $("#fullName").removeClass("is-invalid");
        $(".error_name").text("");
        name_flag = true;
      }
    }

    if (email == '') {
      $("#email").addClass("is-invalid");
      $(".error_email").text("Email Id is required *");
      email_flag = false;
    } else {
      if (email_regex.test(email) == false) {
        $("#email").addClass("is-invalid");
        $(".error_email").text("Please enter valid email id");
        email_flag = false;
      } else {
        $("#email").removeClass("is-invalid");
        $(".error_email").text("");
        email_flag = true;
      }
    }

    if (mobile == '') {
      $("#mobile").addClass("is-invalid");
      $(".error_mobile").text("Mobile is required *");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#mobile").addClass("is-invalid");
        $(".error_mobile").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#mobile").removeClass("is-invalid");
        $(".error_mobile").text("");
        mobile_flag = true;
      }
    }

    if (!$("#exampleCheck1").prop("checked")) {
      $(".error_check").text("Please accept terms and conditions");
      check_flag = false;
    } else {
      // Checkbox is not checked, show an error message or take appropriate action
      $(".error_check").text("");
      check_flag = true
    }


    if (name_flag == true && mobile_flag == true && email_flag == true && check_flag == true) {
      let formData = new FormData();
      formData.append("name", name);
      formData.append("email", email);
      formData.append("mobile", mobile);
      signupAjax(formData, source)
    }
  })

  /*********************************removing validations ************************************/


  $("body").on("input", "#fullName, #email, #company,#talkName, #talkEmail", function () {
    var fieldId = $(this).attr("id");
    var errorClass;
    if (fieldId == 'fullName') {
      errorClass = ".error_name";
    }

    if (fieldId == 'email') {
      errorClass = ".error_email";
    }

    if (fieldId == 'company') {
      errorClass = ".error_company";
    }

    if (fieldId == 'talkName') {
      errorClass = ".error_talk_name";
    }

    if (fieldId == 'talkEmail') {
      errorClass = ".error_talk_email";
    }


    $(this).removeClass("is-invalid");
    $(errorClass).text("");
  });

  $("body").on("input", "#fullName, #email_detail , #exampleCheck1", function () {
    var fieldId = $(this).attr("id");
    var errorClass;
    if (fieldId == 'fullName') {
      errorClass = ".error_name";
    }

    if (fieldId == 'email_detail') {
      errorClass = ".error_email_detail";
    }


    // Check if the current element is a checkbox
    if ($(this).is(":checkbox") && $(this).prop("checked")) {
      errorClass = ".error_check_detail";
    }

    $(this).removeClass("is-invalid");
    $(errorClass).text("");
  });

  $("body").on("click", " #exampleCheck1, #flexCheckDefault", function () {
    var fieldId = $(this).attr("id");
    var errorClass1;
    var errorClass2;
    var errorClass3;

    // Check if the current element is a checkbox
    if ($(this).is(":checkbox") && $(this).prop("checked")) {
      errorClass1 = ".error_check_detail";
      errorClass2 = ".error_check";
      errorClass3 = ".error_checkbox";
    } else {
      $(".error_check_detail").text("Please accept terms and conditions");
      $(".error_check").text("Please accept terms and conditions");
      $(".error_checkbox").text("Please accept terms and conditions");
    }

    $(this).removeClass("is-invalid");
    $(errorClass1).text("");
    $(errorClass2).text("");
    $(errorClass3).text("");
  });

  $("body").on("input change", "#enquiryFullName, #enquiryEmail, #course_id, #talk_course_id, #training_mode , #exampleCheck1", function () {
    var fieldId = $(this).attr("id");
    var errorClass;
    if (fieldId == 'enquiryFullName') {
      errorClass = ".error_home_name";
    }

    if (fieldId == 'enquiryEmail') {
      errorClass = ".error_email_enquiry";
    }


    if (fieldId == 'course_id') {
      errorClass = ".error_course";
    }

    if (fieldId == 'talk_course_id') {
      errorClass = ".error_talk_course";
    }

    if (fieldId == 'training_mode') {
      errorClass = ".error_mode";
    }


    // Check if the current element is a checkbox
    if ($(this).is(":checkbox") && $(this).prop("checked")) {
      errorClass = ".error_check_detail";
    }

    $(this).removeClass("is-invalid");
    $(errorClass).text("");
  });


  /***********************************************/
  $("body").on("click", "#sign-up-btn_detail", function (event) {
    event.preventDefault();

    var name_flag = false;
    var mobile_flag = false;
    var email_flag = false;
    var check_flag = false;

    let source = $('#source').val();
    var name = $("#userFullName").val().trim();
    let email = $("#email_detail").val().trim();
    let mobile = $("#mobile_detail").val().trim();

    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (name == '') {
      $("#userFullName").addClass("is-invalid");
      $(".error_name").text("Name is required *");
      name_flag = false;
    } else {
      if (name.length < 3) {
        $("#userFullName").addClass("is-invalid");
        $(".error_name").text("Name should be more than 3 letter");
        name_flag = false;
      } else {
        $("#userFullName").removeClass("is-invalid");
        $(".error_name").text("");
        name_flag = true;
      }
    }

    if (email == '') {
      $("#email_detail").addClass("is-invalid");
      $(".error_email_detail").text("Email Id is required *");
      email_flag = false;
    } else {
      if (email_regex.test(email) == false) {
        $("#email_detail").addClass("is-invalid");
        $(".error_email_detail").text("Please enter valid email id");
        email_flag = false;
      } else {
        $("#email_detail").removeClass("is-invalid");
        $(".error_email_detail").text("");
        email_flag = true;
      }
    }

    if (mobile == '') {
      $("#mobile_detail").addClass("is-invalid");
      $(".error_mobile_detail").text("Mobile is required *");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#mobile_detail").addClass("is-invalid");
        $(".error_mobile_detail").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#mobile_detail").removeClass("is-invalid");
        $(".error_mobile_detail").text("");
        mobile_flag = true;
      }
    }

    if (!$("#exampleCheck1").prop("checked")) {
      $(".error_check_detail").text("Please accept terms and conditions");
      check_flag = false;
    } else {
      // Checkbox is not checked, show an error message or take appropriate action
      $(".error_check_detail").text("");
      check_flag = true
    }


    if (name_flag == true && mobile_flag == true && email_flag == true && check_flag == true) {
      let formData = new FormData();
      formData.append("name", name);
      formData.append("email", email);
      formData.append("mobile", mobile);
      signupAjax(formData, source)
    }
  })


  /*********************LOGIN BUTTON ********************/
  $("body").on("click", "#loginBtn", function (event) {
    event.preventDefault();
    loginSubmit()
  });

  /*********************SUBMIT THE FORM BY ENTER BUTTON****************************/

  $("body").on("keydown", "#loginMobile", function (event) {
    if (event.key === "Enter") {
      event.preventDefault();
      loginSubmit()
    }
  });

  /**************************REMOVE VALIDATIONS WHILE TYPING ****************************** */
  $("#loginMobile, #mobile_detail, #mobile, #enquiryMobile,#talkMobile").on("input", function () {
    const mobileValue = $(this).val().trim();
    const mobile = $('#loginMobile').val()
    // Check if the entered value is numeric
    if ((/^\d+$/.test(mobileValue))) {
      $("#loginMobile").removeClass("is-invalid");
      $(".error_mobile_login").text("");

      $("#mobile_detail").removeClass("is-invalid");
      $(".error_mobile_detail").text("");

      $("#mobile").removeClass("is-invalid");
      $(".error_mobile").text("");

      $("#enquiryMobile").removeClass("is-invalid");
      $(".error_mobile_enquiry").text("");

      $("#talkMobile").removeClass("is-invalid");
      $(".error_talk_mobile").text("");
    }

  });

  /**********************************************************/
  $('#loginMobile,#mobile_detail,#enquiryMobile,#talkMobile').on('input', function () {
    // Remove non-numeric characters
    var inputValue = $(this).val().replace(/\D/g, '');

    // Update the input field with the cleaned value
    $(this).val(inputValue);
  });

  $('#mobile').on('input', function () {
    // Remove non-numeric characters
    var inputValue = $(this).val().replace(/\D/g, '');

    // Update the input field with the cleaned value
    $(this).val(inputValue);
  });

  $('#contact_btn').on('click', function () {
    var name_flag = false;
    var mobile_flag = false;
    var email_flag = false;
    var company_flag = false;
    var message_flag = false;
    $(".contact_error").text('');
    $(".contact_success").text('');
    var name = $("#fullName").val().trim();
    let email = $("#email").val().trim();
    let mobile = $("#mobile").val().trim();
    let company = $("#company").val().trim();
    // let trainingMode = $("#trainingMode").val().trim();
    let message = $("#message").val().trim();


    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (name == '') {
      $("#fullName").addClass("is-invalid");
      $(".error_name").text("Name is required *");
      name_flag = false;
    } else {
      if (name.length < 3) {
        $("#fullName").addClass("is-invalid");
        $(".error_name").text("Name should be more than 3 letter");
        name_flag = false;
      } else {
        $("#fullName").removeClass("is-invalid");
        $(".error_name").text("");
        name_flag = true;
      }
    }

    if (email == '') {
      $("#email").addClass("is-invalid");
      $(".error_email").text("Email Id is required *");
      email_flag = false;
    } else {
      if (email_regex.test(email) == false) {
        $("#email").addClass("is-invalid");
        $(".error_email").text("Please enter valid email id");
        email_flag = false;
      } else {
        $("#email").removeClass("is-invalid");
        $(".error_email").text("");
        email_flag = true;
      }
    }

    if (mobile == '') {
      $("#mobile").addClass("is-invalid");
      $(".error_mobile").text("Mobile is required *");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#mobile").addClass("is-invalid");
        $(".error_mobile").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#mobile").removeClass("is-invalid");
        $(".error_mobile").text("");
        mobile_flag = true;
      }
    }

    if (company == '') {
      $("#company").addClass("is-invalid");
      $(".error_company").text("Please enter company*");
      company_flag = false;
    } else {
      $("#company").removeClass("is-invalid");
      $(".error_company").text("");
      company_flag = true;

    }

    // if(trainingMode == ''){
    //   $("#trainingMode").addClass("is-invalid");
    //   $(".error_mode").text("Please select course*");
    //   mode_flag = false;
    // }else{
    //       $("#trainingMode").removeClass("is-invalid");
    //       $(".error_mode").text("");
    //       mode_flag = true;

    // }


    if (name_flag == true && mobile_flag == true && email_flag == true && company_flag == true) {
      let formData = new FormData();
      formData.append("name", name);
      formData.append("email", email);
      formData.append("mobile_number", mobile);
      formData.append("company", company);
      formData.append("message", message);

      $.ajax({
        type: "POST",
        url: '/contact-us',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
          if (res.success) {
            $(".contact_success").text(res.message);
            window.setTimeout(function () {
              window.location.href = "/"
            }, 2000);
          } else {
            $(".contact_error").text(res.message);
          }
        },
        error: function () {
          $(".contact_error").text('Something went wrong');
        },
      });
    }
  })

  $('#corporate_btn').on('click', function () {
    var name_flag = false;
    var mobile_flag = false;
    var email_flag = false;
    var company_flag = false;
    var message_flag = false;
    $(".contact_error").text('');
    $(".contact_success").text('');
    const enquiry_type = 2
    var name = $("#corporateName").val().trim();
    let email = $("#corporateEmail").val().trim();
    let mobile = $("#corporateMobile").val().trim();
    let company = $("#corporateCompany").val().trim();
    // let trainingMode = $("#trainingMode").val().trim();
    let message = $("#corporateMessage").val().trim();


    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (name == '') {
      $("#corporateName").addClass("is-invalid");
      $(".error_corporate_name").text("Name is required *");
      name_flag = false;
    } else {
      if (name.length < 3) {
        $("#corporateName").addClass("is-invalid");
        $(".error_corporate_name").text("Name should be more than 3 letter");
        name_flag = false;
      } else {
        $("#corporateName").removeClass("is-invalid");
        $(".error_corporate_name").text("");
        name_flag = true;
      }
    }

    if (email == '') {
      $("#corporateEmail").addClass("is-invalid");
      $(".error_corporate_email").text("Email Id is required *");
      email_flag = false;
    } else {
      if (email_regex.test(email) == false) {
        $("#corporateEmail").addClass("is-invalid");
        $(".error_corporate_email").text("Please enter valid email id");
        email_flag = false;
      } else {
        $("#corporateEmail").removeClass("is-invalid");
        $(".error_corporate_email").text("");
        email_flag = true;
      }
    }

    if (mobile == '') {
      $("#corporateMobile").addClass("is-invalid");
      $(".error_corporate_mobile").text("Mobile is required *");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#corporateMobile").addClass("is-invalid");
        $(".error_corporate_mobile").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#corporateMobile").removeClass("is-invalid");
        $(".error_corporate_mobile").text("");
        mobile_flag = true;
      }
    }

    if (company == '') {
      $("#corporateCompany").addClass("is-invalid");
      $(".error_corporate_company").text("Please enter company*");
      company_flag = false;
    } else {
      $("#corporateCompany").removeClass("is-invalid");
      $(".error_corporate_company").text("");
      company_flag = true;

    }

    // if(trainingMode == ''){
    //   $("#trainingMode").addClass("is-invalid");
    //   $(".error_mode").text("Please select course*");
    //   mode_flag = false;
    // }else{
    //       $("#trainingMode").removeClass("is-invalid");
    //       $(".error_mode").text("");
    //       mode_flag = true;

    // }


    if (name_flag == true && mobile_flag == true && email_flag == true && company_flag == true) {
      let formData = new FormData();
      formData.append("enquiry_type", enquiry_type)
      formData.append("name", name)
      formData.append("email", email)
      formData.append("mobile_number", mobile)
      formData.append("company", company)
      formData.append("message", message)
      $.ajax({
        type: "POST",
        url: '/enquiry-form',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
          if (res.success) {
            $(".success_corporate").text(res.message);
            window.setTimeout(function () {
              $('#corporateModal').modal('hide');
              $(".success_corporate").text("");
            }, 2000);
          } else {
            $(".error_corporate").text(res.message);

            window.setTimeout(function () {
              $(".error_corporate").text("");
            }, 2000);
          }

        },
        error: function () {
          $(".error_corporate").text('Something went wrong')
        },
      });
    }
  })

  $('#otpBtn').on("click", async function (e) {
    e.preventDefault();
    var otp_flag = false;

    let source = $('#source').val();
    var otp = $('#otp').val();
    if (otp == '') {
      $("#otp").addClass("is-invalid");
      $(".error_otp").text("Please enter otp *");
      otp_flag = false;
    } else {
      $("#otp").removeClass("is-invalid");
      $(".error_otp").html("");
      otp_flag = true;
    }
    var user_id = $('#user_id').val();
    let formData = new FormData();
    formData.append('user_id', user_id);
    formData.append('otp', otp);
    $.ajax({
      type: 'POST',
      url: '/verify-otp',
      data: formData,
      dataType: 'json',
      cache: false,
      contentType: false,
      processData: false,
      success: function (res) {
        if (res.success) {
          $(".error_otp").text("");
          $('.success_otp').text(res.message)
          window.setTimeout(function () {
            // if(source == 1){
            //   window.location.href= res.redirect_url
            // }
            // if(source == 2 && res.otp_status == 2){
            //   window.location.href = '/dashboard'
            // }
            if (source == 1) {
              window.location.href = '/dashboard'
            }
            // if(source == 2 && res.otp_status == 1){
            //   $('.modal'). modal('hide');
            //   const myModal = $('#.modal');
            //   // Clear modal content
            //   myModal.find('.modal-body').empty();
            //   window.location.href= res.redirect_url

            // }
            if (source == 2) {
              $('.modal').modal('hide');
              const myModal = $('.modal');
              // Clear modal content
              myModal.find('.modal-body').empty();
              window.location.href = res.redirect_url

            }
          }, 2000);

        } else {
          $(".error_otp").text(res.message);
        }
      },
      error: function (res) {
        $(".error_otp").text('something went wrong');

      }
    })
  })

  $('#becomeInstBtn').on("click", async function (event) {
    event.preventDefault();

    var be_name_flag = false;
    var be_mobile_flag = false;
    var be_email_flag = false;
    var tech_flag = false;
    var message_flag = false;

    var name = $("#instfullName").val().trim();
    let email = $("#instemail").val().trim();
    let mobile = $("#instmobile").val().trim();
    let techStack = $("#techStack").val().trim();
    let message = $("#inst_message").val().trim();


    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (name == '') {
      $("#instfullName").addClass("is-invalid");
      $(".error_name_inst").text("Name is required *");
      be_name_flag = false;
    } else {
      if (name.length < 3) {
        $("#instfullName").addClass("is-invalid");
        $(".error_name_inst").text("Name should be more than 3 letter");
        be_name_flag = false;
      } else {
        $("#instfullName").removeClass("is-invalid");
        $(".error_name_inst").text("");
        be_name_flag = true;
      }
    }

    if (email == '') {
      $("#instemail").addClass("is-invalid");
      $(".error_email_inst").text("Email Id is required *");
      be_email_flag = false;
    } else {
      if (email_regex.test(email) == false) {
        $("#instemail").addClass("is-invalid");
        $(".error_email_inst").text("Please enter valid email id");
        be_email_flag = false;
      } else {
        $("#instemail").removeClass("is-invalid");
        $(".error_email_inst").text("");
        be_email_flag = true;
      }
    }

    if (mobile == '') {
      $("#instmobile").addClass("is-invalid");
      $(".error_mobile_inst").text("Mobile is required *");
      be_mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#instmobile").addClass("is-invalid");
        $(".error_mobile_inst").text("Please enter valid mobile number *");
        be_mobile_flag = false;
      } else {
        $("#instmobile").removeClass("is-invalid");
        $(".error_mobile_inst").text("");
        be_mobile_flag = true;
      }
    }

    if (techStack == '') {
      $("#techStack").addClass("is-invalid");
      $(".error_tech").text("TechStack is required *");
      tech_flag = false;
    } else {
      $("#techStack").removeClass("is-invalid");
      $(".error_tech").text("");
      tech_flag = true;
    }

    if (message == '') {
      $("#inst_message").addClass("is-invalid");
      $(".error_message_inst").text("message is required *");
      message_flag = false;
    } else {
      $("#message").removeClass("is-invalid");
      $(".error_message").text("");
      message_flag = true;
    }


    if (be_name_flag == true && be_mobile_flag == true && be_email_flag == true && tech_flag == true && message_flag == true) {
      let formData = new FormData();
      formData.append("name", name);
      formData.append("email", email);
      formData.append("mobile", mobile);
      formData.append("tech_stack", techStack);
      formData.append("message", message);
      $.ajax({
        type: "POST",
        url: '/become-instructor',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
          if (res.success) {
            $(".success_become_inst").text(res.message);
            window.setTimeout(function () {
              window.location.href = "/"
            }, 2000);
          } else {
            $(".error_become_inst").text(res.message);
          }

        },
        error: function () {
          $(".error_become_inst").text('Something went wrong')
        },
      });

    }
  })

  /*************************REMOVING VALIDATIONS WHEN MODAL DISMISS********************************/
  $('body').on('hidden.bs.modal', '#commonModal', function () {
    // Reset form fields
    $(this).find('form')[0].reset();

    // Clear error messages
    $('.err_msg_small').text('');
    $('#fullName, #mobile, #email').removeClass("is-invalid");

    // Optionally, you can also remove the data attributes
    // $(this).removeData('bs.modal');
  });

  /*************************REMOVING VALIDATIONS WHEN MODAL DISMISS********************************/

  $('#signupModal').on('hidden.bs.modal', function () {
    // Remove validations and error messages
    $("#fullName, #email_detail, #mobile_detail, #exampleCheck1").removeClass("is-invalid");
    $("#fullName, #email_detail, #mobile_detail").val("");
    $('#exampleCheck1').prop('checked', false);
    $(".error_name, .error_email_detail, .error_mobile_detail, .error_check_detail").text("");
  });

  $('#loginModal').on('hidden.bs.modal', function () {
    // Remove validations and error messages
    $("#loginMobile").removeClass("is-invalid");
    $("#loginMobile").val("");
    $(".error_mobile_login").text("");
  });

  $('#curriculumModal').on('hidden.bs.modal', function () {
    // Remove validations and error messages
    $("#curriculumMobile").removeClass("is-invalid");
    $("#curriculumMobile").val("");
    $(".error_mobile_curriculum, .success_curriculum, .error_curriculum").text("");
  });

  $('#corporateModal').on('hidden.bs.modal', function () {
    // Remove validations and error messages
    $("#corporateName, #corporateEmail, #corporateMobile, #corporateCompany").removeClass("is-invalid");
    $("#corporateName, #corporateEmail, #corporateMobile, #corporateCompany, #corporateMessage").val("");
    $(".error_corporate_name, .error_corporate_email, .error_corporate_mobile, .error_corporate_company").text("");
  });


  $('body').on("click", "#enquiry_btn", function () {
    var name_flag = false;
    var mobile_flag = false;
    var email_flag = false;
    var course_flag = false;
    var mode_flag = false;
    var message_flag = false;
    var checkbox_flag = false;

    $(".home_contact_error").text('');
    $(".home_contact_success").text('');

    const enquiry_type = $('#enquiryType').val()
    const full_name = $('#enquiryFullName').val();
    const email = $('#enquiryEmail').val();
    const mobile = $('#enquiryMobile').val();
    const courseId = $("#course_id").val();
    const trainingMode = $("#training_mode").val();
    const message = $("#message").val();
    const termsConditionsElement = $('#flexCheckDefault');
    const training_service_id = $("#training_service_id").val()
    const termsConditions = $('#flexCheckDefault').prop('checked');


    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (full_name == '') {
      $("#enquiryFullName").addClass("is-invalid");
      $(".error_home_name").text("Please enter name*");
      name_flag = false;
    } else {
      if (full_name.length < 3 || !/^[a-zA-Z\s]*$/.test(full_name)) {
        $("#enquiryFullName").addClass("is-invalid");
        $(".error_home_name").text("Please enter a valid name (minimum 3 characters, only accept letters and spaces).");
        name_flag = false;
      } else {
        $("#enquiryFullName").removeClass("is-invalid");
        $(".error_home_name").text("");
        name_flag = true;
      }
    }

    if (email == '') {
      $("#enquiryEmail").addClass("is-invalid");
      $(".error_email_enquiry").text("Please enter email id*");
      email_flag = false;
    } else {
      if (email_regex.test(email) == false) {
        $("#enquiryEmail").addClass("is-invalid");
        $(".error_email_enquiry").text("Please enter valid email id");
        email_flag = false;
      } else {
        $("#enquiryEmail").removeClass("is-invalid");
        $(".error_email_enquiry").text("");
        email_flag = true;
      }
    }

    if (mobile == '') {
      $("#enquiryMobile").addClass("is-invalid");
      $(".error_mobile_enquiry").text("Please enter mobile number*");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#enquiryMobile").addClass("is-invalid");
        $(".error_mobile_enquiry").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#enquiryMobile").removeClass("is-invalid");
        $(".error_mobile_enquiry").text("");
        mobile_flag = true;
      }
    }

    if (courseId == '') {
      $("#course_id").addClass("is-invalid");
      $(".error_course").text("Please select course*");
      course_flag = false;
    } else {
      $("#course_id").removeClass("is-invalid");
      $(".error_course").text("");
      course_flag = true;

    }

    if (trainingMode == '') {
      $("#training_mode").addClass("is-invalid");
      $(".error_mode").text("Please select course mode*");
      mode_flag = false;
    } else {
      $("#training_mode").removeClass("is-invalid");
      $(".error_mode").text("");
      mode_flag = true;

    }

    if (enquiry_type == 1 && termsConditionsElement.length > 0) {
      if (!$("#flexCheckDefault").prop("checked")) {
        $(".error_checkbox").text("Please accept terms and conditions");
        checkbox_flag = false;
      } else {
        // Checkbox is not checked, show an error message or take appropriate action
        $(".error_checkbox").text("");
        checkbox_flag = true
      }
    } else {
      checkbox_flag = true

    }

    // if(termsConditions === false){
    //   $("#flexCheckDefault").addClass("is-invalid");
    //   $(".terms_error").text("Please select to accept terms conditions*");
    //   mode_flag = false;
    // }else{
    //       $("#flexCheckDefault").removeClass("is-invalid");
    //       $(".terms_error").text("");
    //       mode_flag = true;

    // };



    if (name_flag == true && mobile_flag == true && email_flag == true && course_flag == true && mode_flag == true && checkbox_flag == true) {
      let formData = new FormData();
      formData.append("enquiry_type", enquiry_type)
      formData.append("name", full_name)
      formData.append("email", email)
      formData.append("mobile_number", mobile)
      formData.append("course_id", courseId)
      formData.append("training_mode", trainingMode)
      formData.append("message", message);
      formData.append ("training_service_id", training_service_id)
      $.ajax({
        type: "POST",
        url: '/enquiry-form',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
         
          if (res.success) {
            $(".home_contact_success").text(res.message);

            window.setTimeout(function () {
              if(enquiry_type == 1){
                $(".home_contact_success").text("");
                $('#enquiryFullName, #enquiryEmail, #enquiryMobile, #course_id, #training_mode, #message').val('');
                $('#flexCheckDefault').prop('checked', false);


              }else{
                  window.location.href = "/"
              }
            }, 2000);
          } else {
            $(".home_contact_error").text(res.message);
          }

        },
        error: function () {
          $(".home_contact_error").text('Something went wrong')
        },
      });
    }

  })

  $('body').on("click", "#talkToAdvisorBtn", function () {
    var name_flag = false;
    var mobile_flag = false;
    var email_flag = false;
    var course_flag = false;

    $(".talk_to_advisor_error").text('');
    $(".talk_to_advisor_success").text('');

    const enquiry_type = 3
    const full_name = $('#talkName').val();
    const email = $('#talkEmail').val();
    const mobile = $('#talkMobile').val();
    const courseId = $("#talk_course_id").val();

    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (full_name == '') {
      $("#talkName").addClass("is-invalid");
      $(".error_talk_name").text("Please enter name*");
      name_flag = false;
    } else {
      if (full_name.length < 3 || !/^[a-zA-Z\s]*$/.test(full_name)) {
        $("#talkName").addClass("is-invalid");
        $(".error_talk_name").text("Please enter a valid name (minimum 3 characters, only accept letters and spaces).");
        name_flag = false;
      } else {
        $("#talkName").removeClass("is-invalid");
        $(".error_talk_name").text("");
        name_flag = true;
      }
    }

    if (email == '') {
      $("#talkEmail").addClass("is-invalid");
      $(".error_talk_email").text("Please enter email id*");
      email_flag = false;
    } else {
      if (email_regex.test(email) == false) {
        $("#talkEmail").addClass("is-invalid");
        $(".error_talk_email").text("Please enter valid email id");
        email_flag = false;
      } else {
        $("#talkEmail").removeClass("is-invalid");
        $(".error_talk_email").text("");
        email_flag = true;
      }
    }

    if (mobile == '') {
      $("#talkMobile").addClass("is-invalid");
      $(".error_talk_mobile").text("Please enter mobile number*");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#talkMobile").addClass("is-invalid");
        $(".error_talk_mobile").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#talkMobile").removeClass("is-invalid");
        $(".error_talk_mobile").text("");
        mobile_flag = true;
      }
    }

    if (courseId == '') {
      $("#talk_course_id").addClass("is-invalid");
      $(".error_talk_course").text("Please select course*");
      course_flag = false;
    } else {
      $("#talk_course_id").removeClass("is-invalid");
      $(".error_talk_course").text("");
      course_flag = true;

    }

    if (name_flag == true && mobile_flag == true && email_flag == true && course_flag == true) {
      let formData = new FormData();
      formData.append("enquiry_type", enquiry_type)
      formData.append("name", full_name)
      formData.append("email", email)
      formData.append("mobile_number", mobile)
      formData.append("course_id", courseId)
      $.ajax({
        type: "POST",
        url: '/enquiry-form',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
          if (res.success) {
            $(".talk_to_advisor_success").text(res.message);
            window.setTimeout(function () {
              $('#talkToAdvisorModel').modal('hide');
            }, 2000);
          } else {
            $(".talk_to_advisor_error").text(res.message);
          }

        },
        error: function () {
          $(".talk_to_advisor_error").text('Something went wrong')
        },
      });
    }

  })

  $(document).on('click', '#copyPhoneNumber', function () {

    var phoneNumber = $(this).attr('value');
    // Copy the phone number to the clipboard
    copyToClipboard(phoneNumber, 1);
  });

  $(document).on('click', '#copyEmail', function () {

    var email = $(this).text();
    // Copy the phone number to the clipboard
    copyToClipboard(email, 2);
  });

  $("body").on("click", "#registrationBtn", function () {

    var name_flag = false;
    var mobile_flag = false;
    // var email_flag = false;

    var name = $("#fullName").val().trim();
    let email = $("#email").val().trim();
    let mobile = $("#mobile").val().trim();
    let course_id = $('#courseId').val();
    // let time_table_id = $('#timeTableId').val();

    var email_regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;

    if (name == '') {
      $("#fullName").addClass("is-invalid");
      $(".error_name").text("Name is required *");
      name_flag = false;
    } else {
      if (name.length < 3) {
        $("#fullName").addClass("is-invalid");
        $(".error_name").text("Name should be more than 3 letter");
        name_flag = false;
      } else {
        $("#fullName").removeClass("is-invalid");
        $(".error_name").text("");
        name_flag = true;
      }
    }

    // if(email == ''){
    //     $("#email").addClass("is-invalid");
    //     $(".error_email").text("Email Id is required *");
    //     email_flag = false;
    // }else{
    //     if(email_regex.test(email)==false)
    //     {
    //         $("#email").addClass("is-invalid");
    //         $(".error_email").text("Please enter valid email id");
    //         email_flag = false;
    //     }else{
    //         $("#email").removeClass("is-invalid");
    //         $(".error_email").text("");
    //         email_flag = true;
    //     }
    // }

    if (mobile == '') {
      $("#mobile").addClass("is-invalid");
      $(".error_mobile").text("Mobile is required *");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#mobile").addClass("is-invalid");
        $(".error_mobile").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#mobile").removeClass("is-invalid");
        $(".error_mobile").text("");
        mobile_flag = true;
      }
    };

   


    if (name_flag == true && mobile_flag == true) {
      let formData = new FormData();
      formData.append("name", name);
      formData.append("email", email);
      formData.append("mobile", mobile);
      formData.append("course_id", course_id);
      // formData.append("time_table_id", time_table_id);


      $.ajax({
        type: "POST",
        url: '/registration-data',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
          if (res.success) {
            const data = res.course_data
            $(".modal-body .error_register").text("");
            $(".modal-body .success_register").text(res.message);
            window.setTimeout(function () {
              window.location.href = "/courses/" + data.slug
              // window.location.href="/course-detail-page?id="+res.course_id
            }, 2000);
          } else {
            $(".error_register").text(res.message);
          }
        },
        error: function () {
          $(".error_register").text('Something went wrong');
        },
      });
    }
  }).on("click", "#skipBtn", function () {
    $('#commonModal').modal('hide');
    let course_id = $('#courseId').val();
    let courseSlug = $('#courseSlug').val();
    // window.location.href = "/course-detail-page?id="+course_id;
    window.location.href = "/courses/" + courseSlug;
  });


  $("body").on("click", "#registrationInterestBtn", function () {
    var name_flag = false;
    var mobile_flag = false;
    // var email_flag = false;

    var name = $("#interestedName").val().trim();
    let email = $("#interestedName").val().trim();
    let mobile = $("#interestedMobile").val().trim();
    let course_id = $('#courseId').val();
    console.log(course_id)

    

    if (name == '') {
      $("#interestedName").addClass("is-invalid");
      $(".error_interest_name").text("Name is required *");
      name_flag = false;
    } else {
      if (name.length < 3) {
        $("#interestedName").addClass("is-invalid");
        $(".error_interest_name").text("Name should be more than 3 letter");
        name_flag = false;
      } else {
        $("#interestedName").removeClass("is-invalid");
        $(".error_interest_name").text("");
        name_flag = true;
      }
    }

    // if(email == ''){
    //     $("#email").addClass("is-invalid");
    //     $(".error_email").text("Email Id is required *");
    //     email_flag = false;
    // }else{
    //     if(email_regex.test(email)==false)
    //     {
    //         $("#email").addClass("is-invalid");
    //         $(".error_email").text("Please enter valid email id");
    //         email_flag = false;
    //     }else{
    //         $("#email").removeClass("is-invalid");
    //         $(".error_email").text("");
    //         email_flag = true;
    //     }
    // }

    if (mobile == '') {
      $("#interestedMobile").addClass("is-invalid");
      $(".error_interest_mobile").text("Mobile is required *");
      mobile_flag = false;
    } else {
      if (mobile.length > 10 || mobile.length < 10) {
        $("#interestedMobile").addClass("is-invalid");
        $(".error_interest_mobile").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#interestedMobile").removeClass("is-invalid");
        $(".error_interest_mobile").text("");
        mobile_flag = true;
      }
    }


    if (name_flag == true && mobile_flag == true) {
      let formData = new FormData();
      formData.append("name", name);
      formData.append("email", email);
      formData.append("mobile", mobile);
      formData.append("course_id", course_id);

      console.log(JSON.stringify(formData))
      $.ajax({
        type: "POST",
        url: '/registration-data',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
          if (res.success) {
            const data = res.course_data
            $(".modal-body .error_intrest_register ").text("");

            $(".modal-body .success_intrest_register").text(res.message);
            setTimeout(() => {
              $('#interestedModal').modal('hide');
              $(".modal-body .success_intrest_register").text("");
            }, 1000)
          } else {
            $(".error_register").text(res.message);
          }
        },
        error: function () {
          $(".error_register").text('Something went wrong');
        },
      });
    }
  }).on("click", "#skipInterestBtn", function () {
    $('#interestedModal').modal('hide');
  });

  $('#interestedModal').on('hidden.bs.modal', function (e) {
    $(this).find('form')[0].reset();

    // Clear error messages
    $('.err_msg_small').text('');
    $('#interestedName, #interestedMobile').removeClass("is-invalid");
  });

  $('#talkToAdvisorModel').on('hidden.bs.modal', function (e) {
    $(this).find('form')[0].reset();

    // Clear error messages
    $('.err_msg_small').text('');
    $('#talkName, #talkMobile, #talkEmail, #talk_course_id').removeClass("is-invalid");
  });



  $(document).on("click", ".openRegisterModal", function () {
    var course = $(this).data('id');
    var course_name = $(this).data('name');
    var course_slug = $(this).data('slug');
    // var time_table_id = $(this).data('timeid');
    $(".modal-body #courseId").val(course);
    $(".modal-body #courseName").text(course_name);
    $(".modal-body #courseSlug").val(course_slug);
    // $(".modal-body #timeTableId").val( time_table_id );
  });

  $(document).on("click", ".openIntrestedModal", function () {
    var course = $(this).data('id');
    $(".modal-body #courseId").val(course);
  });

  $(document).on("click", ".openCurriculum", function () {
    var course = $(this).data('id');
    $(".modal-body #curriculumCourseId").val(course);
  });



  //   $("body").on("click", "#registrationBtn", function () {

  //     var name_flag = false;
  //     var mobile_flag = false;
  //     // var email_flag = false;

  //     var name = $("#fullName").val().trim();
  //     let email = $("#email").val().trim();
  //     let mobile = $("#mobile").val().trim();
  //     let course_id = $('#courseId').val();

  //     var email_regex=/^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;

  //     if(name == ''){
  //         $("#fullName").addClass("is-invalid");
  //         $(".error_name").text("Name is required *");
  //         name_flag = false;
  //     }else{
  //         if (name.length < 3) {
  //             $("#fullName").addClass("is-invalid");
  //             $(".error_name").text("Name should be more than 3 letter");
  //             name_flag = false;
  //         } else {
  //             $("#fullName").removeClass("is-invalid");
  //             $(".error_name").text("");
  //             name_flag = true;
  //         }
  //     }

  //     // if(email == ''){
  //     //     $("#email").addClass("is-invalid");
  //     //     $(".error_email").text("Email Id is required *");
  //     //     email_flag = false;
  //     // }else{
  //     //     if(email_regex.test(email)==false)
  //     //     {
  //     //         $("#email").addClass("is-invalid");
  //     //         $(".error_email").text("Please enter valid email id");
  //     //         email_flag = false;
  //     //     }else{
  //     //         $("#email").removeClass("is-invalid");
  //     //         $(".error_email").text("");
  //     //         email_flag = true;
  //     //     }
  //     // }

  //     if(mobile == ''){
  //       $("#mobile").addClass("is-invalid");
  //       $(".error_mobile").text("Mobile is required *");
  //       mobile_flag = false;
  //     } else{
  //         if(mobile.length > 10 || mobile.length < 10){
  //           $("#mobile").addClass("is-invalid");
  //           $(".error_mobile").text("Please enter valid mobile number *");
  //           mobile_flag = false;
  //         } else{
  //           $("#mobile").removeClass("is-invalid");
  //               $(".error_mobile").text("");
  //               mobile_flag = true;
  //         }
  //     }


  //     if(name_flag == true && mobile_flag == true ){
  //     let formData = new FormData();
  //     formData.append("name", name);
  //     formData.append("email", email);
  //     formData.append("mobile", mobile);
  //     formData.append("course_id", course_id);


  //     $.ajax({
  //         type: "POST",
  //         url: '/registration-data',
  //         data: formData,
  //         dataType: "json",
  //         cache: false,
  //         contentType: false,
  //         processData: false,
  //         success: function (res) {
  //           console.log(res)
  //             if(res.success){
  //               $(".modal-body .success_register").text(res.message);
  //               window.setTimeout(function() {
  //                 window.location.href="/"+res.course_data?.slug
  //             }, 2000);
  //           }else{
  //             $(".error_register").text(res.message);
  //           }
  //         },
  //         error: function () {
  //           $(".error_register").text('Something went wrong');
  //         },
  //         });
  //     }
  //   }).on("click", "#skipBtn", function () {
  //     let course_id = $('#courseId').val();
  //     window.location.href = "/"+course_id;
  // });


  $("body").on("click", "#curriculumBtn", function (event) {
    event.preventDefault();
    var mobile_flag = false;
    let mobile = $("#curriculumMobile").val();
    let courseId = $("#curriculumCourseId").val();
    var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

    if (mobile == '') {
      $("#curriculumMobile").addClass("is-invalid");
      $(".error_mobile_curriculum").text("Mobile is required *");
      mobile_flag = false;
    } else {
      if (mobile.length < 6 || mobile.length > 15) {
        $("#curriculumMobile").addClass("is-invalid");
        $(".error_mobile_curriculum").text("Please enter valid mobile number *");
        mobile_flag = false;
      } else {
        $("#curriculumMobile").removeClass("is-invalid");
        $(".error_mobile_curriculum").html("");
        mobile_flag = true;
      }
    }


    if (mobile_flag == true) {
      let formData = new FormData();
      formData.append("mobile_number", mobile);
      formData.append("course_id", courseId);
      $.ajax({
        type: "POST",
        url: '/downloaded-user',
        data: formData,
        dataType: "json",
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
          if (res.success) {
            $(".success_curriculum").text(res.message);
            window.setTimeout(function () {
              $('.modal').modal('hide');
              $(".modal-body #courseCurriculumId").val(courseId);
              $(".modal-body #user_id_curriculum").val(res.userId);
              $('#curriculumOtpModal').modal('show');
            }, 2000);
          } else {
            $(".error_curriculum").text(res.message);
          }

        },
        error: function () {
          console.log('something went wrong')
        },
      });

    }
  });


  // otpBtnCurriculum
  $('#otpBtnCurriculum').on("click", async function (e) {
    e.preventDefault();
    var otp_flag = false;

    var otp = $('#otp_curriculum').val();
    var curriculumCourse = $('#courseCurriculumId').val();
    if (otp == '') {
      $("#otp_curriculum").addClass("is-invalid");
      $(".error_otp_curriculum").text("Please enter otp *");
      otp_flag = false;
    } else {
      $("#otp_curriculum").removeClass("is-invalid");
      $(".error_otp_curriculum").html("");
      otp_flag = true;
    }
    var user_id = $('#user_id_curriculum').val();
    let formData = new FormData();
    formData.append('user_id', user_id);
    formData.append('otp', otp);
    $.ajax({
      type: 'POST',
      url: '/verify-otp-download',
      data: formData,
      dataType: 'json',
      cache: false,
      contentType: false,
      processData: false,
      success: function (res) {
        if (res.success) {
          $('.success_otp_curriculum').text(res.message)
          window.setTimeout(function () {
            $('.modal').modal('hide');
            window.location.href = '/export-curriculum/' + curriculumCourse
          }, 2000);

        } else {
          $(".error_otp_curriculum").text(res.message);
        }
      },
      error: function (res) {
        $(".error_otp_curriculum").text('something went wrong');

      }
    })
  })







});

function loginSubmit() {
  var mobile_flag = false;
  var login_email_flag = false;
  let source = $('#source').val();
  let mobile = $("#loginMobile").val();
  let loginEmail = $("#loginEmail").val();
  var mobileExpr = /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[6789]\d{9}$/;

  if (mobile) {
    if (mobile.length < 6 || mobile.length > 15) {
      $("#loginMobile").addClass("is-invalid");
      $(".error_mobile_login").text("Please enter valid mobile number *");
      mobile_flag = false;
    } 
  } else {
    $("#loginMobile").removeClass("is-invalid");
    $(".error_mobile_login").html("");
    mobile_flag = true;
  }

  if (loginEmail == '') {
    if (email_regex.test(loginEmail) == false) {
      $("#loginEmail").addClass("is-invalid");
      $(".error_login_email").text("Please enter valid Email id");
      login_email_flag = false;
    }
  }else {
    $("#loginEmail").removeClass("is-invalid");
    $(".error_login_email").text("");
    login_email_flag = true;
  }

  console.log(mobile)
  console.log(loginEmail)
  if (mobile_flag == true || login_email_flag == true) {
    let formData = new FormData();
    formData.append("mobile", mobile);
    formData.append("email", loginEmail);
    loginAjax(formData, source)

  }
}

function loginAjax(formData, source) {
  $.ajax({
    type: "POST",
    url: '/login',
    data: formData,
    dataType: "json",
    cache: false,
    contentType: false,
    processData: false,
    success: function (res) {
      console.log(res)
      $(".error_mobile_login").text("");
      if (res.success) {
        $(".success_login").text(res.message);
        window.setTimeout(function () {
          if (source == 1) {
            window.location.href = "/otp?id=" + res.userId
          }
          if (source == 2) {
            $('.modal').modal('hide');
            $(".modal-body #user_id").val(res.userId);
            $('#otpModal').modal('show');
          }
        }, 2000);
      } else {
        $(".error_mobile_login").text(res.message);
      }

    },
    error: function () {
      console.log('something went wrong')
    },
  });
}

function signupAjax(formData, source) {
  $.ajax({
    type: "POST",
    url: '/sign-up',
    data: formData,
    dataType: "json",
    cache: false,
    contentType: false,
    processData: false,
    success: function (res) {
      if (res.success) {
        $(".error_signup").text("");
        $(".success_signup").text(res.message);
        window.setTimeout(function () {

          if (source == 1) {
            window.location.href = "/otp?id=" + res.userId

          }
          if (source == 2) {
            $('.modal').modal('hide');
            $(".modal-body #user_id").val(res.userId);
            $('#otpModal').modal('show');
          }
        }, 2000);
      } else {
        $(".error_signup").text(res.message);
      }
    },
    error: function () {
      $(".error_signup").text('Something went wrong');
    },
  });
}

// function formatDate(originalDate1) {
//   let options = { day: 'numeric', month: 'short' };
//   const originalDate = new Date(originalDate1);
//   console.log(originalDate1)
//   console.log(originalDate)
//   console.log(originalDate.toLocaleDateString('en-US', { day: 'numeric', month: 'short' }))
//   let formattedDate = originalDate.toLocaleDateString('en-US', { day: 'numeric', month: 'short' });
//   return formattedDate;

// }

// function formateTime(originalDate1) {
//   const originalDate = new Date(originalDate1);
//   let hours = originalDate.getHours();
//   let minutes = originalDate.getMinutes();
//   let period = hours >= 12 ? 'PM' : 'AM';


//   // Format the hours to 12-hour format (e.g., 12:00 PM)
//   if (hours > 12) {
//     hours -= 12;
//   } else if (hours === 0) {
//     hours = 12;
//   }
//   // let formattedTime = `${hours}:${minutes < 10 ? '0' : ''}${minutes} ${period}`;
//   let formattedTime =  originalDate.toLocaleTimeString('en-IN', { hour: 'numeric', minute: 'numeric', hour12: true })

//   return formattedTime
// }



function formatDate(originalDate1) {
  const originalDate = new Date(originalDate1);
  const utcTime = Date.UTC(
    originalDate.getFullYear(),
    originalDate.getMonth(),
    originalDate.getDate(),
    originalDate.getHours(),
    originalDate.getMinutes(),
    originalDate.getSeconds()
  );

  // Apply UTC-5:30 offset
  const adjustedDate = new Date(utcTime - 5.5 * 60 * 60 * 1000);

  let formattedDate = adjustedDate.toLocaleDateString('en-US', { day: 'numeric', month: 'short' });
  return formattedDate;
  
}

function formateTime(originalDate1) {
  const originalDate = new Date(originalDate1);

  const utcTime = Date.UTC(
    originalDate.getFullYear(),
    originalDate.getMonth(),
    originalDate.getDate(),
    originalDate.getHours(),
    originalDate.getMinutes(),
    originalDate.getSeconds()
  );

  // Apply UTC-5:30 offset
  // const adjustedTime = new Date(utcTime - 5.5 * 60 * 60 * 1000);
  // dateObj.setHours(dateObj.getHours() - 5); 
  // dateObj.setMinutes(dateObj.getMinutes() - 30); 
  
   originalDate.setHours(originalDate.getHours()- 5);
   originalDate.setMinutes(originalDate.getMinutes()- 30);


  // Format the hours to 12-hour format (e.g., 12:00 PM)
  // if (hours > 12) {
  //   hours -= 12;
  // } else if (hours === 0) {
  //   hours = 12;
  // }

  let formattedTime = originalDate.toLocaleTimeString('en-US', { hour: 'numeric', minute: 'numeric', hour12: true });

  return formattedTime;
}
















function copyToClipboard(text, type) {
  // Create a temporary input element
  var tempInput = $('<input>');

  // Set the input element's value to the text to be copied
  tempInput.val(text);
  // Append the input element to the DOM
  $('body').append(tempInput);

  // Select the text in the input element
  tempInput.select();

  // Copy the selected text to the clipboard
  document.execCommand('copy');

  // Remove the temporary input element from the DOM
  tempInput.remove();

  var email_regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

  const validatePhoneNumber = (phoneNumber) => {
    // You can use your own logic to validate phone numbers
    // For simplicity, let's assume any numeric value is a valid phone number
    return /^\d+$/.test(phoneNumber);
  };

  if (type == 1) {
    if (window.innerWidth < 768) {
      // Small screen, likely a mobile device
      window.location.href = "tel:" + text;
    } else {
      // Larger screen, possibly a tablet or desktop
      // Handle accordingly
    }
  } else {
    window.location.href = "mailto:" + text;
  }

  // if (validatePhoneNumber(text)) {
  //   if (window.innerWidth < 768) {
  //     // Small screen, likely a mobile device
  //     window.location.href = "tel:" + text;
  //   } else {
  //     // Larger screen, possibly a tablet or desktop
  //     // Handle accordingly
  //   }
  // } else{
  //   window.location.href = "mailto:" + text;
  // }



}

function userData(id) {
  let formData = new FormData();
  formData.append('course_id', id)
  $.ajax({
    type: "POST",
    url: '/registration-data',
    data: formData,
    dataType: "json",
    cache: false,
    contentType: false,
    processData: false,
    success: function (res) {

      if (res.success) {
        const data = res.course_data
        $('#dataGetModal').modal('show');
        window.setTimeout(function () {
          window.location.href = "/courses/" + data.slug
          // window.location.href="/course-detail-page?id="+res.course_id
        }, 2000);
      } else {
        $(".error_register").text(res.message);
      }
    },
    error: function () {
      $(".error_register").text('Something went wrong');
    },
  });

}



// $(".courses-tab-1").click(function(){
//   $(".landing-courses").addClass("gaps");
//   $(".landing-timetable").removeClass("gaps");
//   $(".training-features").removeClass("gaps");
//   $(".landing-certificates").removeClass("gaps");

// });

// $(".Certificate-tab-4").click(function(){
//   $(".landing-certificates").addClass("gaps");
//   $(".landing-courses").removeClass("gaps");
//   $(".landing-timetable").removeClass("gaps");
//   $(".training-features").removeClass("gaps");


// })

// $(".timetable-tab-3").click(function(){
//   $(".landing-timetable").addClass("gaps");
//   $(".landing-certificates").removeClass("gaps");
//   $(".landing-courses").removeClass("gaps");
//   $(".training-features").removeClass("gaps");

// })

// $(".training-tab-5").click(function(){
//   $(".training-features").addClass("gaps");
//   $(".landing-timetable").removeClass("gaps");
//   $(".landing-certificates").removeClass("gaps");
//   $(".landing-courses").removeClass("gaps");

// })



function trainingType(data, courseId) {
  let formData = new FormData();
  formData.append('course_id', courseId)
  formData.append('training_type_id', data)
  $.ajax({
    type: "POST",
    url: '/filter-data',
    data: formData,
    dataType: "json",
    cache: false,
    contentType: false,
    processData: false,
    success: function (res) {

      if (res.success) {
        const facultyID = $('#facultyList');
        facultyID.empty();
        const faculty = res.faculty_list
        faculty.forEach(function (faculty) {
          $('#facultyList').append('<option value="' + faculty.id + '">' + faculty.faculty_name + '</option>');
        });

        if (faculty.length == 0) {
          $('#facultyList').append('<option >' + ' Select Faculty' + '</option>')
        }
        const selectedFaculty = $('#facultyList').val();
        facultyData(selectedFaculty, courseId);
      };

    },
    error: function () {
      $(".error_register").text('Something went wrong');
    },
  });
}

function facultyData(data, courseId) {
  const trianing_type_id = $('#trainingTypeId').val()
  let formData = new FormData();
  formData.append('training_type_id', trianing_type_id)
  formData.append('faculty_id', data)
  formData.append('course_id', courseId)

  $.ajax({
    type: "POST",
    url: '/filter-data',
    data: formData,
    dataType: "json",
    cache: false,
    contentType: false,
    processData: false,
    success: function (res) {
      if (res.success) {
        const batches = $('#batches');
        batches.empty();
        const batchesList = res.batches_list
        batchesList.forEach(function (batch) {

          $('#batches').append('<option value="' + batch.id + '">' + new Date(batch.start_date_time).toLocaleDateString('en-US', { year: 'numeric', month: 'short', day: 'numeric' }) + '</option>');

        });

        if (batchesList.length > 0) {
          $('#duration').text(batchesList[0].duration)
          $('#total_price').text(batchesList[0].course_fee - batchesList[0].offer_fee)
          $('a.downloadClm').attr('href', '/export-curriculum/' + courseId);
          $('a.enrollCourse').attr('href', '/check-out?id=' + batchesList[0].id);
        }

        if (batchesList.length == 0) {
          $('#batches').append('<option >' + ' Select Batch' + '</option>')

        }
      };

    },
    error: function () {
      $(".error_register").text('Something went wrong');
    },
  });
}

function batchRes(data, courseId) {
  let formData = new FormData();
  formData.append('time_table_id', data)
  formData.append('course_id', courseId)

  $.ajax({
    type: "POST",
    url: '/filter-data',
    data: formData,
    dataType: "json",
    cache: false,
    contentType: false,
    processData: false,
    success: function (res) {
      if (res.success) {
        const courseData = res.course_details
        $('#duration').text(courseData.duration)
        $('#total_price').text(courseData.course_fee - courseData.offer_fee)
        $('a.downloadClm').attr('href', '/export-curriculum/' + courseId);
        $('a.enrollCourse').attr('href', '/check-out?id=' + data);
      };

    },
    error: function () {
      $(".error_register").text('Something went wrong');
    },
  });
}

function openShareModal(courseId) {
  // Set the data-id attribute of the modal for later use
  console.log(courseId,'courseIdcourseId')
  $('#shareModal').attr('data-id', courseId);
  $(".modal-body #shareCourse").text(location.origin + `/courses/${courseId}`);
  // Show the modal
  $('#shareModal').modal('show');
}

function shareToOther(type) {
  const courseId = $('#shareModal').attr('data-id');
  // var url = location.origin + `/course-detail-page?id=${courseId}`;
  var url = location.origin + `/courses/${courseId}`;

  switch (type) {
    case 'facebook':
      window.open(`https://www.facebook.com/sharer/sharer.php?u=${encodeURIComponent(url)}`, '_blank');
      break;
    case 'instagram':
      alert('Instagram sharing may not work from a web application. Please use a mobile app.');
      break;
    case 'whatsapp':
      if (/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)) {
        window.location.href = `whatsapp://send?text=${encodeURIComponent(url)}`;
      } else {
        window.open(`https://web.whatsapp.com/send?text=${encodeURIComponent(url)}`, '_blank');
      }
      break;
    case 'linkedin':
      window.open(`https://www.linkedin.com/sharing/share-offsite/?url=${encodeURIComponent(url)}`, '_blank');
      break;
    case 'copy':
      // Create a temporary input element
      var tempInput = $('<input>');

      // Set the input element's value to the text to be copied
      tempInput.val(url);
      // Append the input element to the DOM
      $('#shareModal .modal-body').append(tempInput);
      // Select the text in the input element
      tempInput.select();

      // Copy the selected text to the clipboard
      document.execCommand('copy');

      // Remove the temporary input element from the DOM
      tempInput.remove();
      alert('link copied')
      break;
    default:
      break;
  }
}


function updateMetaTags() {

}



































