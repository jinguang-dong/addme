package defpackage;

import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qos {
    public final rww a;
    private final rww b;

    public qos() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.fr();
    }

    public final String b() {
        return (String) this.a.fr();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qos) {
            return Objects.equals(a(), ((qos) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return b();
    }

    public qos(final long j) {
        if (j <= -100 || j >= 100) {
            final int i = 2;
            this.a = rnt.y(new rww() { // from class: qor
                @Override // defpackage.rww
                public final Object fr() {
                    int i2 = i;
                    if (i2 == 0) {
                        return String.valueOf(j);
                    }
                    if (i2 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            this.b = rnt.y(new nxi(this, 8));
        } else {
            final int i2 = 1;
            this.b = rnt.y(new rww() { // from class: qor
                @Override // defpackage.rww
                public final Object fr() {
                    int i22 = i2;
                    if (i22 == 0) {
                        return String.valueOf(j);
                    }
                    if (i22 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            final int i3 = 0;
            this.a = rnt.y(new rww() { // from class: qor
                @Override // defpackage.rww
                public final Object fr() {
                    int i22 = i3;
                    if (i22 == 0) {
                        return String.valueOf(j);
                    }
                    if (i22 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
        }
    }
}
