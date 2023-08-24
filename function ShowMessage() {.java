function ShowMessage() {
  var ui = SpreadsheetApp.getUi();
  ui.alert('Welcome Grant Administrators!', 'Most of the projects have a significant difference in the total dollar amount from the time activities vs. the invoices. So, all totals have been calculated starting with the sum of all invoices in QuickBooks with the most recent open i.e.non-applied time activities added to that total. For Grant Administrators: please remember that the invoices and ledger totals that exist in the grant file may not match the totals in QuickBooks. This spreadsheet is representative of QuickBooks records and therefore should serve as a means of comparison only. Drawdown BTD totals that have been officially approved by DED cannot be changed. Please keep this in mind when preparing future DDs, since the amounts will need to still be calculated based on previously approved DDs.', ui.ButtonSet.OK);
}