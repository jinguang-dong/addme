package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onb extends oix {
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;
    public final byte[][] k;
    public static final byte[][] a = new byte[0][];
    public static final Parcelable.Creator CREATOR = new azu(10);

    public onb(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
        this.k = bArr7;
    }

    public static byte[][] a(List list, ona onaVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            onb onbVar = (onb) it.next();
            if (onbVar != null && (bArrA2 = onaVar.a(onbVar)) != null) {
                length += bArrA2.length;
            }
        }
        byte[][] bArr = new byte[length][];
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            onb onbVar2 = (onb) it2.next();
            if (onbVar2 != null && (bArrA = onaVar.a(onbVar2)) != null) {
                for (byte[] bArr2 : bArrA) {
                    if (bArr2 != null) {
                        bArr[i] = bArr2;
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new ong(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.i;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetAi = ujp.ai(length);
        for (int i : iArr) {
            hashSetAi.add(Integer.valueOf(i));
        }
        return hashSetAi;
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetAi = ujp.ai(length);
        for (byte[] bArr2 : bArr) {
            ojl.ay(bArr2);
            hashSetAi.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetAi;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof onb) {
            onb onbVar = (onb) obj;
            if (a.K(this.b, onbVar.b) && a.K(c(), onbVar.c()) && a.K(e(this.d), e(onbVar.d)) && a.K(e(this.e), e(onbVar.e)) && a.K(e(this.f), e(onbVar.f)) && a.K(e(this.g), e(onbVar.g)) && a.K(d(this.h), d(onbVar.h)) && a.K(b(this.j), b(onbVar.j)) && a.K(e(this.k), e(onbVar.k))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.b;
        sb.append(str == null ? "null" : a.bw(str, "'", "'"));
        byte[] bArr = this.c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.d);
        sb.append(", ");
        f(sb, "PSEUDO=", this.e);
        sb.append(", ");
        f(sb, "ALWAYS=", this.f);
        sb.append(", ");
        f(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        f(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.j).toArray()));
        sb.append(", ");
        f(sb, "external=", this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.b);
        ojl.D(parcel, 3, this.c);
        ojl.E(parcel, 4, this.d);
        ojl.E(parcel, 5, this.e);
        ojl.E(parcel, 6, this.f);
        ojl.E(parcel, 7, this.g);
        ojl.G(parcel, 8, this.h);
        ojl.E(parcel, 9, this.i);
        ojl.G(parcel, 10, this.j);
        ojl.E(parcel, 11, this.k);
        ojl.w(parcel, iU);
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append(yoGAhrpjU.GZpA);
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            ojl.ay(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }
}
