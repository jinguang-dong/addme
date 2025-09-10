package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmr {
    public static final cmr a = a(new Locale[0]);
    public final cms b;

    private cmr(cms cmsVar) {
        this.b = cmsVar;
    }

    public static cmr a(Locale... localeArr) {
        return b(new LocaleList(localeArr));
    }

    public static cmr b(LocaleList localeList) {
        return new cmr(new cms(localeList));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cmr) && this.b.equals(((cmr) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
