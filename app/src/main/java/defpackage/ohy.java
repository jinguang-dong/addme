package defpackage;

import android.content.ComponentName;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohy {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    private final ComponentName e;

    public ohy(String str, String str2, boolean z) {
        ojl.aw(str);
        this.a = str;
        ojl.aw(str2);
        this.b = str2;
        this.e = null;
        this.c = 4225;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohy)) {
            return false;
        }
        ohy ohyVar = (ohy) obj;
        if (a.K(this.a, ohyVar.a) && a.K(this.b, ohyVar.b)) {
            ComponentName componentName = ohyVar.e;
            if (a.K(null, null)) {
                int i = ohyVar.c;
                if (this.d == ohyVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return this.a;
    }
}
