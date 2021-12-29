/*
 * Copyright (c) 2012, 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2016 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_pl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "stycznia",
               "lutego",
               "marca",
               "kwietnia",
               "maja",
               "czerwca",
               "lipca",
               "sierpnia",
               "wrze\u015bnia",
               "pa\u017adziernika",
               "listopada",
               "grudnia",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "sty",
               "lut",
               "mar",
               "kwi",
               "maj",
               "cze",
               "lip",
               "sie",
               "wrz",
               "pa\u017a",
               "lis",
               "gru",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "s",
               "l",
               "m",
               "k",
               "m",
               "c",
               "l",
               "s",
               "w",
               "p",
               "l",
               "g",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "niedziela",
               "poniedzia\u0142ek",
               "wtorek",
               "\u015broda",
               "czwartek",
               "pi\u0105tek",
               "sobota",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "niedz.",
               "pon.",
               "wt.",
               "\u015br.",
               "czw.",
               "pt.",
               "sob.",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "n",
               "p",
               "w",
               "\u015b",
               "c",
               "p",
               "s",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "I kwarta\u0142",
               "II kwarta\u0142",
               "III kwarta\u0142",
               "IV kwarta\u0142",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "I kw.",
               "II kw.",
               "III kw.",
               "IV kw.",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "a",
               "p",
            };
        final String[] metaValue_Eras = new String[] {
               "p.n.e.",
               "n.e.",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "HH:mm:ss zzzz",
               "HH:mm:ss z",
               "HH:mm:ss",
               "HH:mm",
            };
        final String[] metaValue_buddhist_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_buddhist_long_Eras = new String[] {
               "BC",
               "e.b.",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE, d MMMM y G",
               "d MMMM y G",
               "d MMM y G",
               "dd.MM.y G",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE, d MMMM y GGGG",
               "d MMMM y GGGG",
               "d MMM y GGGG",
               "dd.MM.y GGGG",
            };
        final String[] metaValue_roc_AmPmMarkers = new String[] {
               "AM",
               "PM",
            };
        final String[] metaValue_roc_long_Eras = new String[] {
               "przed ROC",
               "ROC",
            };
        final String metaValue_calendarname_gregorian = "kalendarz gregoria\u0144ski";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "rok" },
            { "calendarname.islamic-umalqura", "kalendarz islamski (Umm al-Kura)" },
            { "buddhist.narrow.Eras", metaValue_buddhist_long_Eras },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "kalendarz islamski (metoda obliczeniowa)" },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_roc_long_Eras },
            { "timezone.regionFormat.standard", "{0} (czas standardowy)" },
            { "calendarname.japanese", "kalendarz japo\u0144ski" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "long.Eras",
                new String[] {
                    "przed nasz\u0105 er\u0105",
                    "naszej ery",
                }
            },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "minuta" },
            { "field.era", "era" },
            { "field.dayperiod", "rano / po po\u0142udniu / wieczorem" },
            { "standalone.MonthNarrows",
                new String[] {
                    "S",
                    "L",
                    "M",
                    "K",
                    "M",
                    "C",
                    "L",
                    "S",
                    "W",
                    "P",
                    "L",
                    "G",
                    "",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "Muharram",
                    "Safar",
                    "Rabi\u02bb I",
                    "Rabi\u02bb II",
                    "D\u017cumada I",
                    "D\u017cumada II",
                    "Rad\u017cab",
                    "Szaban",
                    "Ramadan",
                    "Szawwal",
                    "Zu al-kada",
                    "Zu al-hid\u017cd\u017ca",
                    "",
                }
            },
            { "calendarname.roc", "kalendarz Republiki Chi\u0144skiej" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "field.month", "miesi\u0105c" },
            { "field.second", "sekunda" },
            { "roc.Eras",
                new String[] {
                    "Przed ROC",
                    "ROC",
                }
            },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                }
            },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "kalendarz islamski (metoda wzrokowa)" },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "czas: {0}" },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows",
                new String[] {
                    "N",
                    "P",
                    "W",
                    "\u015a",
                    "C",
                    "P",
                    "S",
                }
            },
            { "buddhist.long.Eras", metaValue_buddhist_long_Eras },
            { "islamic.AmPmMarkers", metaValue_roc_AmPmMarkers },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "field.zone", "strefa czasowa" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_roc_long_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "dzie\u0144 tygodnia" },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_buddhist_long_Eras },
            { "field.week", "tydzie\u0144" },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_roc_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "timezone.regionFormat.daylight", "{0} (czas letni)" },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd.MM.y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "field.hour", "godzina" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "Muh.",
                    "Saf.",
                    "Rab. I",
                    "Rab. II",
                    "D\u017cu. I",
                    "D\u017cu. II",
                    "Ra.",
                    "Sza.",
                    "Ram.",
                    "Szaw.",
                    "Zu al-k.",
                    "Zu al-h.",
                    "",
                }
            },
            { "calendarname.buddhist", "kalendarz buddyjski" },
            { "standalone.MonthNames",
                new String[] {
                    "stycze\u0144",
                    "luty",
                    "marzec",
                    "kwiecie\u0144",
                    "maj",
                    "czerwiec",
                    "lipiec",
                    "sierpie\u0144",
                    "wrzesie\u0144",
                    "pa\u017adziernik",
                    "listopad",
                    "grudzie\u0144",
                    "",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
