package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class day {
    final int a;
    final int b;
    final String c;

    public day(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.A;
        this.b = preference.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof day)) {
            return false;
        }
        day dayVar = (day) obj;
        return this.a == dayVar.a && this.b == dayVar.b && TextUtils.equals(this.c, dayVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
