package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxr {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public qxr(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final qxr a() {
        return new qxr(this.a, this.b, this.c, this.d, true, this.f);
    }

    public final qxr b() {
        Uri uri = this.a;
        if (uri == null) {
            Log.w("PhenotypeFlag", "Setting enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new qxr(uri, this.b, this.c, this.d, this.e, true);
    }

    public final qxr c() {
        String str = this.b;
        if (str.isEmpty()) {
            return new qxr(this.a, str, this.c, true, this.e, this.f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    @Deprecated
    public final qxt d(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        int i = qxt.d;
        return new qxl(this, str, boolValueOf, false);
    }

    @Deprecated
    public final qxt e(String str, Object obj, qxq qxqVar) {
        int i = qxt.d;
        return new qxo(this, str, obj, qxqVar);
    }

    public final qxt f(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        int i = qxt.d;
        return new qxj(this, str, lValueOf, true);
    }

    public final qxt g(String str, String str2) {
        int i = qxt.d;
        return new qxn(this, str, str2, true);
    }

    public final qxt h(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        int i = qxt.d;
        return new qxl(this, str, boolValueOf, true);
    }

    public final qxt i(String str, qxq qxqVar, String str2) {
        int i = qxt.d;
        return new qxp(this, str, str2, qxqVar);
    }

    public qxr(Uri uri) {
        this(uri, "", IQwwK.wDOlLZwdsRN, false, false, false);
    }
}
