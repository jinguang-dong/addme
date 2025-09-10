package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rac {
    public final toj a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;
    private final List j;

    public rac(boolean z, List list, toj tojVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        tojVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        this.i = z;
        this.j = list;
        this.a = tojVar;
        this.b = str;
        this.c = str2;
        this.d = list2;
        this.e = list3;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final boolean a(tag tagVar) {
        tagVar.getClass();
        return this.i && this.j.contains(tagVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rac)) {
            return false;
        }
        rac racVar = (rac) obj;
        return this.i == racVar.i && a.ao(this.j, racVar.j) && a.ao(this.a, racVar.a) && a.ao(this.b, racVar.b) && a.ao(this.c, racVar.c) && a.ao(this.d, racVar.d) && a.ao(this.e, racVar.e) && this.f == racVar.f && this.g == racVar.g && this.h == racVar.h;
    }

    public final int hashCode() {
        int iO = (((((((((((a.o(this.i) * 31) + this.j.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        boolean z = this.h;
        return (((((iO * 31) + a.o(this.f)) * 31) + a.o(this.g)) * 31) + a.o(z);
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.i + ", enabledBackings=" + this.j + ", secret=" + this.a + ", dirPath=" + this.b + ", gmsCoreDirPath=" + this.c + ", includeStaticConfigPackages=" + this.d + ", excludeStaticConfigPackages=" + this.e + ", hasStorageInfoFromGms=" + this.f + ", allowEmptySnapshotToken=" + this.g + ", enableCommitV2Api=" + this.h + ")";
    }
}
