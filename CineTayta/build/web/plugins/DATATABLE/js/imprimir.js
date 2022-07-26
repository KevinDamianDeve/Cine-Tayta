$(document).ready(function () {
                var table = $('#tabla').DataTable({
                    rowReorder: {
                        selector: 'td:nth-child(2)'
                    },
                    fixedHeader: true,
                    responsive: true,
                    autoFill: true,
                    paging: true,
                    ordering: true,
                    searching: true,
                    info: true,
                    scrollY: 200,
                    deferRender: true,
                    scroller: true,

                    language: {
                        url: "//cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
                    },
                    lengthMenu: [
                        [10, 25, 50, -1],
                        ['10 Filas', '25 Filas', '50 Filas', 'Todos']
                    ],
                    dom: 'Bfrtip',
                    buttons: [
                        'copyHtml5',
                        'excelHtml5',
                        'csvHtml5',
                        'print',
                        'pageLength',
                        {
                            extend: 'pdfHtml5',
                            download: 'open'
                        }
                    ]

                });



            });