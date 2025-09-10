package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihx {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;

    public ihx(File file, File file2, File file3, File file4, File file5) {
        this.a = file;
        this.b = file2;
        this.c = file3;
        this.d = file4;
        this.e = file5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihx)) {
            return false;
        }
        ihx ihxVar = (ihx) obj;
        return a.ao(this.a, ihxVar.a) && a.ao(this.b, ihxVar.b) && a.ao(this.c, ihxVar.c) && a.ao(this.d, ihxVar.d) && a.ao(this.e, ihxVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WriteBoosterFiles(blocksPerSegment=" + this.a + ", segmentsPerAllocation=" + this.b + ", currentAllocations=" + this.c + ", availableAllocationsTenPercentage=" + this.d + ", lifetimeEstimateTenPercentage=" + this.e + ")";
    }
}
