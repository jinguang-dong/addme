package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gzg {
    public final String a;
    public final String b;
    public final boolean c;
    public final Supplier d;

    public gzg(String str, String str2, boolean z, Supplier supplier) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = supplier;
        boolean z2 = true;
        if (str2 != null && supplier != null) {
            z2 = false;
        }
        rnt.B(z2, "A GcaConfig Key can either have a PhenotypeFeatureGroup or a PhenotypeFlagSupplier. Not both. Prefer using PhenotypeFlagSupplier for process stable phenotype access");
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.d != null;
    }
}
