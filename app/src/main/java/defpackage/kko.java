package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kko {
    public final kkq a;
    public final List b;
    public final List c;

    public kko(kkq kkqVar, List list, List list2) {
        this.a = kkqVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kko)) {
            return false;
        }
        kko kkoVar = (kko) obj;
        return this.a.equals(kkoVar.a) && this.b.equals(kkoVar.b) && this.c.equals(kkoVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        rwb rwbVar = new rwb("ImageSaverTrace");
        rwbVar.b("ProcessingMethod", this.a);
        rwbVar.b("Input Image Metadata", this.b);
        rwbVar.b("Reprocessing Metadata", this.c);
        return rwbVar.toString();
    }
}
