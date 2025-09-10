package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.libraries.barhopper.Barcode;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpn {
    private static final DecimalFormat a = new DecimalFormat("#.###");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v20 */
    public final synchronized List a(Barcode[] barcodeArr, int i, int i2) {
        ArrayList arrayList;
        boolean z;
        rfw rfwVar;
        Barcode.WiFi wiFi;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        boolean z2;
        Parcelable parcelable4;
        String strSubstring;
        boolean z3;
        Barcode[] barcodeArr2 = barcodeArr;
        synchronized (this) {
            barcodeArr2.getClass();
            a.I(i2 > 0);
            a.I(i > 0);
            arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < barcodeArr2.length) {
                Barcode barcode = barcodeArr2[i3];
                String str = barcode.displayValue;
                rvk rvkVar = rvk.a;
                rgc rgcVar = new rgc(str, rvkVar);
                rfy rfyVarA = null;
                switch (barcode.valueFormat) {
                    case 1:
                        z = 1;
                        rfwVar = rfw.h;
                        Barcode.ContactInfo contactInfo = barcode.contactInfo;
                        rfx rfxVar = new rfx(null);
                        Barcode.PersonName personName = contactInfo.name;
                        if (personName != null) {
                            rfxVar.a = rwc.j(personName.formattedName);
                        }
                        for (Barcode.Phone phone : contactInfo.phones) {
                            if (phone.number.length() > 0 && phone.number.length() < 60) {
                                rfxVar.c().h(new rgc(phone.number, rvkVar).a);
                            }
                        }
                        for (Barcode.Email email : contactInfo.emails) {
                            rfxVar.b().h(email.address);
                        }
                        String[] strArr = contactInfo.urls;
                        if (strArr.length > 0) {
                            rfxVar.e(strArr[0]);
                        }
                        Barcode.Address[] addressArr = contactInfo.addresses;
                        if (addressArr.length > 0) {
                            rfxVar.d(TextUtils.join("\n", addressArr[0].addressLines));
                        }
                        if (!TextUtils.isEmpty(contactInfo.organization)) {
                            rfxVar.c = rwc.j(contactInfo.organization);
                        }
                        if (!TextUtils.isEmpty(contactInfo.note)) {
                            rfxVar.b = rwc.j(contactInfo.note);
                        }
                        rfyVarA = rfxVar.a();
                        wiFi = null;
                        parcelable = null;
                        parcelable2 = null;
                        parcelable3 = null;
                        break;
                    case 2:
                        z2 = true;
                        z2 = true;
                        rfwVar = rfw.EMAIL;
                        Barcode.Email email2 = barcode.email;
                        if (email2 != null) {
                            rgcVar = new rgc(String.format("?to=%s&subject=%s&body=%s", email2.address, b(rnt.U(email2.subject)), b(rnt.U(email2.body))), rvkVar).b(barcode.displayValue);
                        }
                        wiFi = null;
                        parcelable = null;
                        z3 = z2;
                        parcelable4 = parcelable;
                        z = z3;
                        parcelable3 = parcelable4;
                        parcelable2 = parcelable4;
                        z = z;
                        break;
                    case 3:
                    case 5:
                        z2 = true;
                        z2 = true;
                        z2 = true;
                        int i4 = barcode.format;
                        rfwVar = (i4 & 1632) != 0 ? rfw.PRODUCT_UPC : i4 == 256 ? rfw.QR : rfw.RAW_BARCODE;
                        wiFi = null;
                        parcelable = null;
                        z3 = z2;
                        parcelable4 = parcelable;
                        z = z3;
                        parcelable3 = parcelable4;
                        parcelable2 = parcelable4;
                        z = z;
                        break;
                    case 4:
                        z2 = true;
                        rfwVar = rfw.PHONE;
                        rgcVar = new rgc(barcode.displayValue, rvkVar);
                        wiFi = null;
                        parcelable = null;
                        z3 = z2;
                        parcelable4 = parcelable;
                        z = z3;
                        parcelable3 = parcelable4;
                        parcelable2 = parcelable4;
                        z = z;
                        break;
                    case 6:
                        z2 = true;
                        boolean z4 = true;
                        rfwVar = rfw.SMS;
                        String str2 = barcode.sms.phoneNumber;
                        if (str2 != null) {
                            rgcVar = rgcVar.a(str2);
                            parcelable = barcode.sms;
                            wiFi = null;
                            parcelable4 = null;
                            parcelable3 = parcelable4;
                            parcelable2 = parcelable4;
                            z = z4;
                            break;
                        }
                        wiFi = null;
                        parcelable = null;
                        z3 = z2;
                        parcelable4 = parcelable;
                        z4 = z3;
                        parcelable3 = parcelable4;
                        parcelable2 = parcelable4;
                        z = z4;
                    case 7:
                        z2 = true;
                        rfwVar = rfw.QR_TEXT;
                        wiFi = null;
                        parcelable = null;
                        z3 = z2;
                        parcelable4 = parcelable;
                        z4 = z3;
                        parcelable3 = parcelable4;
                        parcelable2 = parcelable4;
                        z = z4;
                        break;
                    case 8:
                        z2 = true;
                        rfwVar = rfw.URL;
                        String str3 = barcode.displayValue;
                        int length = str3.length();
                        int iCharCount = 0;
                        while (iCharCount < length) {
                            int iCodePointAt = str3.codePointAt(iCharCount);
                            if (!Character.isWhitespace(iCodePointAt)) {
                                strSubstring = str3.substring(iCharCount, length);
                                if (!rwv.a(strSubstring, "http://") && !rwv.a(strSubstring, "https://")) {
                                    strSubstring = "https://".concat(String.valueOf(strSubstring));
                                }
                                rgcVar = new rgc(Uri.parse(strSubstring).normalizeScheme().toString(), rvkVar);
                                wiFi = null;
                                parcelable = null;
                                z3 = z2;
                                parcelable4 = parcelable;
                                z4 = z3;
                                parcelable3 = parcelable4;
                                parcelable2 = parcelable4;
                                z = z4;
                                break;
                            } else {
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        }
                        strSubstring = str3.substring(iCharCount, length);
                        if (!rwv.a(strSubstring, "http://")) {
                            strSubstring = "https://".concat(String.valueOf(strSubstring));
                        }
                        rgcVar = new rgc(Uri.parse(strSubstring).normalizeScheme().toString(), rvkVar);
                        wiFi = null;
                        parcelable = null;
                        z3 = z2;
                        parcelable4 = parcelable;
                        z4 = z3;
                        parcelable3 = parcelable4;
                        parcelable2 = parcelable4;
                        z = z4;
                    case 9:
                        z3 = true;
                        rfwVar = rfw.QR_WIFI;
                        wiFi = barcode.wifi;
                        wiFi.getClass();
                        rgcVar = rgcVar.a(wiFi.ssid);
                        parcelable = null;
                        parcelable4 = parcelable;
                        z4 = z3;
                        parcelable3 = parcelable4;
                        parcelable2 = parcelable4;
                        z = z4;
                        break;
                    case 10:
                        rfwVar = rfw.QR_GEO;
                        Barcode.GeoPoint geoPoint = barcode.geoPoint;
                        if (geoPoint != null) {
                            double d = geoPoint.lat;
                            double d2 = geoPoint.lng;
                            StringBuilder sb = new StringBuilder();
                            z = 1;
                            sb.append("(");
                            sb.append(d);
                            sb.append(",");
                            sb.append(d2);
                            sb.append(")");
                            String string = sb.toString();
                            DecimalFormat decimalFormat = a;
                            rgcVar = rgcVar.a(string).b("(" + decimalFormat.format(barcode.geoPoint.lat) + "°, " + decimalFormat.format(barcode.geoPoint.lng) + "°)");
                            wiFi = null;
                            parcelable = null;
                            parcelable3 = null;
                            parcelable2 = geoPoint;
                            break;
                        } else {
                            z2 = true;
                            wiFi = null;
                            parcelable = null;
                            z3 = z2;
                            parcelable4 = parcelable;
                            z4 = z3;
                            parcelable3 = parcelable4;
                            parcelable2 = parcelable4;
                            z = z4;
                            break;
                        }
                    case 11:
                        rfwVar = rfw.CALENDAR_ENTRY;
                        Barcode.CalendarEvent calendarEvent = barcode.calendarEvent;
                        parcelable3 = calendarEvent != null ? calendarEvent : null;
                        rgcVar = rgcVar.a(calendarEvent.summary);
                        wiFi = null;
                        parcelable = null;
                        parcelable2 = null;
                        z = 1;
                        break;
                    default:
                        z = 1;
                        rfwVar = rfw.QR;
                        if (barcode.format == 256) {
                            rgcVar = rgcVar.a("");
                        } else {
                            rge.a.c(this, "Unexpected Barcode valueFormat, %d, of non-QR type " + barcode.valueFormat, new Object[0]);
                        }
                        wiFi = null;
                        parcelable = null;
                        parcelable2 = null;
                        parcelable3 = null;
                        rfyVarA = null;
                        break;
                }
                rnt.B(barcode.cornerPoints.length == 4 ? z : false, "Barcode does not have expected four corner points.");
                float f = barcode.cornerPoints[0].x;
                float f2 = barcode.cornerPoints[0].y;
                float f3 = barcode.cornerPoints[z].x;
                float f4 = barcode.cornerPoints[z].y;
                float f5 = barcode.cornerPoints[2].x;
                float f6 = barcode.cornerPoints[2].y;
                float f7 = barcode.cornerPoints[3].x;
                float f8 = barcode.cornerPoints[3].y;
                float[] fArr = new float[8];
                fArr[0] = f;
                fArr[z] = f2;
                fArr[2] = f3;
                fArr[3] = f4;
                fArr[4] = f5;
                fArr[5] = f6;
                fArr[6] = f7;
                fArr[7] = f8;
                sbp sbpVarL = sbp.l(new rgf(fArr));
                rga rgaVarC = rgb.C();
                rgaVarC.b = rgcVar;
                rgaVarC.h(rfwVar);
                rgaVarC.a = z;
                rgaVarC.i = 2;
                rgaVarC.f();
                rgaVarC.e(sbpVarL);
                if (rfwVar != rfw.RAW_TEXT) {
                    rgaVarC.c = rwc.j(barcode);
                }
                if (rfyVarA != null) {
                    rgaVarC.g(rfyVarA);
                }
                if (wiFi != null) {
                    rgaVarC.d = rwc.j(wiFi);
                }
                if (parcelable != null) {
                    rgaVarC.e = rwc.j(parcelable);
                }
                if (parcelable2 != null) {
                    rgaVarC.g = rwc.j(parcelable2);
                }
                if (parcelable3 != null) {
                    rgaVarC.f = rwc.j(parcelable3);
                }
                arrayList.add(rgaVarC.a());
                i3++;
                barcodeArr2 = barcodeArr;
            }
        }
        return arrayList;
    }

    private final String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            rge.a.c(this, YyLACfm.NNG, str);
            return "";
        }
    }
}
