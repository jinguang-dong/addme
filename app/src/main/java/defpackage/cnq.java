package defpackage;

import android.view.DisplayCutout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnq {
    public final DisplayCutout a;

    public cnq(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final int a() {
        return this.a.getSafeInsetBottom();
    }

    public final int b() {
        return this.a.getSafeInsetLeft();
    }

    public final int c() {
        return this.a.getSafeInsetRight();
    }

    public final int d() {
        return this.a.getSafeInsetTop();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((cnq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
