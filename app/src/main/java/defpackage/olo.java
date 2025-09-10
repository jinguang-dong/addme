package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olo extends oix {
    public static final Parcelable.Creator CREATOR = new okg(13);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final olo f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof olo) {
            olo oloVar = (olo) obj;
            if (this.a == oloVar.a && a.ao(this.b, oloVar.b) && a.ao(this.c, oloVar.c) && a.ao(this.d, oloVar.d) && a.ao(this.f, oloVar.f) && a.ao(this.e, oloVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        int length = str != null ? str.length() : 0;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + 18 + length);
        sb.append(this.a);
        sb.append("/");
        sb.append(str2);
        if (str != null) {
            sb.append("[");
            if (ujp.B(str, str2)) {
                sb.append((CharSequence) str, str2.length(), str.length());
            } else {
                sb.append(str);
            }
            sb.append("]");
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.J(parcel, 3, this.b);
        ojl.J(parcel, 4, this.c);
        ojl.J(parcel, 6, this.d);
        ojl.I(parcel, 7, this.f, i);
        ojl.N(parcel, 8, this.e);
        ojl.w(parcel, iU);
    }

    public olo(int i, String str, String str2, String str3, List list, olo oloVar) {
        if (oloVar != null && oloVar.a()) {
            throw new IllegalArgumentException(HHdu.MGy);
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        if (str3 == null) {
            if (oloVar != null) {
                str3 = oloVar.d;
            } else {
                str3 = null;
            }
        }
        this.d = str3;
        if (list == null) {
            list = oloVar != null ? oloVar.e : null;
            if (list == null) {
                int i2 = sbp.d;
                list = sex.a;
                list.getClass();
            }
        }
        this.e = ujp.aY(list);
        this.f = oloVar;
    }
}
