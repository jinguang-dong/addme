package defpackage;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class k extends Format {
    public static final /* synthetic */ int d = 0;
    private static final String[] e = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] f = {"", "currency", "percent", "integer"};
    private static final String[] g = {"", "short", "medium", "long", "full"};
    private static final Locale h = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient aa b;
    public transient Map c;
    private transient DateFormat i;
    private transient NumberFormat j;
    private transient j k;
    private transient j l;

    private static final int c(String str, String[] strArr) {
        byte[] bArr = f.a;
        if (str.length() != 0 && (f.a(str.charAt(0)) || f.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length && f.a(str.charAt(i))) {
                i++;
            }
            if (i < length) {
                while (true) {
                    int i2 = length - 1;
                    if (!f.a(str.charAt(i2))) {
                        break;
                    }
                    length = i2;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(h);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    private final void d(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String str2;
        String strF;
        Object objValueOf;
        short s;
        short s2;
        int iIndexOf;
        boolean z;
        Object objValueOf2;
        Map map2;
        boolean z2;
        aa aaVar;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        aa aaVar2 = this.b;
        String str3 = aaVar2.a;
        int iA = aaVar2.d(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z3 = true;
        int i3 = 1;
        while (true) {
            z zVarD = this.b.d(i3);
            int i4 = zVarD.e;
            int i5 = zVarD.a - iA;
            if (i5 != 0 && !str3.regionMatches(iA, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 == 3 || i4 == 4) {
                str2 = str3;
                iA = zVarD.a();
            } else {
                int iC = this.b.c(i3);
                int iB = zVarD.b();
                z zVarD2 = this.b.d(i3 + 1);
                if (objArr != null) {
                    s = zVarD2.c;
                    objValueOf = Integer.valueOf(s);
                    strF = null;
                } else {
                    strF = zVarD2.e == 9 ? this.b.f(zVarD2) : Integer.toString(zVarD2.c);
                    objValueOf = strF;
                    s = 0;
                }
                int i6 = i3 + 2;
                Map map3 = this.c;
                if (map3 != null && (format = (Format) map3.get(Integer.valueOf(i3))) != null) {
                    parsePosition2.setIndex(index);
                    objValueOf2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    str2 = str3;
                    iIndexOf = parsePosition2.getIndex();
                    z = z3;
                    s2 = s;
                } else if (iB == z3 || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i3)))) {
                    str2 = str3;
                    boolean z4 = z3;
                    s2 = s;
                    StringBuilder sb = new StringBuilder();
                    aa aaVar3 = this.b;
                    String str4 = aaVar3.a;
                    int iA2 = aaVar3.d(iC).a();
                    int i7 = iC + 1;
                    while (true) {
                        z zVarD3 = this.b.d(i7);
                        int i8 = zVarD3.e;
                        sb.append((CharSequence) str4, iA2, zVarD3.a);
                        if (i8 == 6 || i8 == 2) {
                            break;
                        }
                        i7++;
                        iA2 = zVarD3.a();
                    }
                    String string = sb.toString();
                    iIndexOf = string.length() != 0 ? str.indexOf(string, index) : str.length();
                    if (iIndexOf < 0) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    String strSubstring = str.substring(index, iIndexOf);
                    boolean zEquals = strSubstring.equals(a.bx(objValueOf, "{", "}"));
                    z = !zEquals;
                    objValueOf2 = z4 == zEquals ? null : strSubstring;
                } else {
                    if (iB != 3) {
                        if (!e.b(iB) && iB != 5) {
                            throw new IllegalStateException("unexpected argType ".concat(e.a(iB)));
                        }
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                    parsePosition2.setIndex(index);
                    aa aaVar4 = this.b;
                    int index2 = parsePosition2.getIndex();
                    double d2 = Double.NaN;
                    int i9 = index2;
                    int i10 = i6;
                    while (true) {
                        z2 = z3;
                        if (aaVar4.h(i10) == 7) {
                            str2 = str3;
                            s2 = s;
                            break;
                        }
                        double dA = aaVar4.a(aaVar4.d(i10));
                        int i11 = i10 + 2;
                        int iC2 = aaVar4.c(i11);
                        String str5 = aaVar4.a;
                        str2 = str3;
                        int iA3 = aaVar4.d(i11).a();
                        int i12 = 0;
                        while (true) {
                            i11++;
                            s2 = s;
                            z zVarD4 = aaVar4.d(i11);
                            aaVar = aaVar4;
                            if (i11 == iC2 || zVarD4.e == 3) {
                                int i13 = zVarD4.a - iA3;
                                if (i13 != 0 && !str.regionMatches(index2, str5, iA3, i13)) {
                                    i = -1;
                                    break;
                                }
                                i12 += i13;
                                if (i11 == iC2) {
                                    i = i12;
                                    break;
                                }
                                iA3 = zVarD4.a();
                            }
                            aaVar4 = aaVar;
                            s = s2;
                        }
                        if (i >= 0 && (i2 = i + index2) > i9) {
                            if (i2 == str.length()) {
                                i9 = i2;
                                d2 = dA;
                                break;
                            } else {
                                i9 = i2;
                                d2 = dA;
                            }
                        }
                        i10 = iC2 + 1;
                        z3 = z2;
                        aaVar4 = aaVar;
                        str3 = str2;
                        s = s2;
                    }
                    if (i9 == index2) {
                        parsePosition2.setErrorIndex(index2);
                    } else {
                        parsePosition2.setIndex(i9);
                    }
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        objValueOf2 = Double.valueOf(d2);
                        iIndexOf = parsePosition2.getIndex();
                        z = z2;
                    }
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s2] = objValueOf2;
                    } else {
                        if (map != null) {
                            map.put(strF, objValueOf2);
                        }
                        iA = this.b.d(iC).a();
                        index = iIndexOf;
                        i3 = iC;
                    }
                    iA = this.b.d(iC).a();
                    index = iIndexOf;
                    i3 = iC;
                } else {
                    iA = this.b.d(iC).a();
                    index = iIndexOf;
                    i3 = iC;
                }
            }
            i3++;
            z3 = true;
            str3 = str2;
        }
    }

    private final void e(Object obj, ogk ogkVar, FieldPosition fieldPosition) throws IOException {
        if (obj == null || (obj instanceof Map)) {
            f(null, (Map) obj, ogkVar, fieldPosition);
        } else {
            f((Object[]) obj, null, ogkVar, fieldPosition);
        }
    }

    private final void f(Object[] objArr, Map map, ogk ogkVar, FieldPosition fieldPosition) throws IOException {
        if (objArr != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        b(0, null, objArr, map, null, ogkVar, fieldPosition);
    }

    private final void g(int i, i iVar, Object[] objArr, Map map, Object[] objArr2, ogk ogkVar) throws IOException {
        if (this.b.f == 2) {
            throw new UnsupportedOperationException("JDK apostrophe mode not supported");
        }
        b(i, iVar, objArr, map, objArr2, ogkVar, null);
    }

    public final NumberFormat a() {
        if (this.j == null) {
            this.j = NumberFormat.getInstance(this.a);
        }
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x04d2, code lost:
    
        r3 = r40;
        r5 = r42;
        r6 = r43;
        r2 = r16;
        r1 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04be A[LOOP:2: B:115:0x0231->B:260:0x04be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04d2 A[EDGE_INSN: B:326:0x04d2->B:262:0x04d2 BREAK  A[LOOP:2: B:115:0x0231->B:260:0x04be], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r38, defpackage.i r39, java.lang.Object[] r40, java.util.Map r41, java.lang.Object[] r42, defpackage.ogk r43, java.text.FieldPosition r44) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.b(int, i, java.lang.Object[], java.util.Map, java.lang.Object[], ogk, java.text.FieldPosition):void");
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) throws IOException {
        e(obj, new ogk(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) throws IOException {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        ogk ogkVar = new ogk(sb);
        ogkVar.c = new ArrayList();
        e(obj, ogkVar, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (eof eofVar : ogkVar.c) {
            attributedString.addAttribute((AttributedCharacterIterator.Attribute) eofVar.c, eofVar.d, eofVar.a, eofVar.b);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (this.b.d) {
            HashMap map = new HashMap();
            int index = parsePosition.getIndex();
            d(str, parsePosition, null, map);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return map;
        }
        int iC = 0;
        short s = -1;
        while (true) {
            if (iC != 0) {
                iC = this.b.c(iC);
            }
            while (true) {
                iC++;
                int iH = this.b.h(iC);
                if (iH == 6) {
                    break;
                }
                if (iH == 2) {
                    iC = -1;
                    break;
                }
            }
            if (iC < 0) {
                break;
            }
            short s2 = this.b.d(iC + 1).c;
            if (s2 > s) {
                s = s2;
            }
        }
        Object[] objArr = new Object[s + 1];
        int index2 = parsePosition.getIndex();
        d(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return objArr;
    }

    public k(String str, Locale locale) {
        Cloneable numberFormat;
        this.a = locale;
        try {
            aa aaVar = this.b;
            if (aaVar == null) {
                this.b = new aa(str);
            } else {
                aaVar.i(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int iB = this.b.b() - 2;
            int i = 1;
            while (i < iB) {
                z zVarD = this.b.d(i);
                if (zVarD.e == 6 && zVarD.b() == 2) {
                    aa aaVar2 = this.b;
                    int i2 = i + 3;
                    String strF = aaVar2.f(aaVar2.d(i + 2));
                    String strF2 = UvOvSgfD.fTCnxXNvqabzZyF;
                    z zVarD2 = this.b.d(i2);
                    if (zVarD2.e == 11) {
                        strF2 = this.b.f(zVarD2);
                        i2 = i + 4;
                    }
                    int iC = c(strF, e);
                    if (iC != 0) {
                        if (iC != 1) {
                            if (iC == 2) {
                                int iC2 = c(strF2, g);
                                if (iC2 != 0) {
                                    if (iC2 != 1) {
                                        if (iC2 != 2) {
                                            if (iC2 != 3) {
                                                if (iC2 != 4) {
                                                    numberFormat = new SimpleDateFormat(strF2, this.a);
                                                } else {
                                                    numberFormat = DateFormat.getTimeInstance(0, this.a);
                                                }
                                            } else {
                                                numberFormat = DateFormat.getTimeInstance(1, this.a);
                                            }
                                        } else {
                                            numberFormat = DateFormat.getTimeInstance(2, this.a);
                                        }
                                    } else {
                                        numberFormat = DateFormat.getTimeInstance(3, this.a);
                                    }
                                } else {
                                    numberFormat = DateFormat.getTimeInstance(2, this.a);
                                }
                            } else {
                                throw new IllegalArgumentException(a.bw(strF, "Unknown format type \"", "\""));
                            }
                        } else {
                            int iC3 = c(strF2, g);
                            if (iC3 != 0) {
                                if (iC3 != 1) {
                                    if (iC3 != 2) {
                                        if (iC3 != 3) {
                                            if (iC3 != 4) {
                                                numberFormat = new SimpleDateFormat(strF2, this.a);
                                            } else {
                                                numberFormat = DateFormat.getDateInstance(0, this.a);
                                            }
                                        } else {
                                            numberFormat = DateFormat.getDateInstance(1, this.a);
                                        }
                                    } else {
                                        numberFormat = DateFormat.getDateInstance(2, this.a);
                                    }
                                } else {
                                    numberFormat = DateFormat.getDateInstance(3, this.a);
                                }
                            } else {
                                numberFormat = DateFormat.getDateInstance(2, this.a);
                            }
                        }
                    } else {
                        int iC4 = c(strF2, f);
                        if (iC4 != 0) {
                            if (iC4 != 1) {
                                if (iC4 != 2) {
                                    if (iC4 != 3) {
                                        numberFormat = new DecimalFormat(strF2, new DecimalFormatSymbols(this.a));
                                    } else {
                                        numberFormat = NumberFormat.getIntegerInstance(this.a);
                                    }
                                } else {
                                    numberFormat = NumberFormat.getPercentInstance(this.a);
                                }
                            } else {
                                numberFormat = NumberFormat.getCurrencyInstance(this.a);
                            }
                        } else {
                            numberFormat = NumberFormat.getInstance(this.a);
                        }
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i), numberFormat);
                    i = i2;
                }
                i++;
            }
        } catch (RuntimeException e2) {
            aa aaVar3 = this.b;
            if (aaVar3 != null) {
                aaVar3.a = null;
                aaVar3.d = false;
                aaVar3.b.clear();
                ArrayList arrayList = aaVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }
}
