package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgj {
    public final Locale a;

    public cgj(Locale locale) {
        this.a = locale;
    }

    public final String a() {
        return this.a.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof cgj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.ao(a(), ((cgj) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
