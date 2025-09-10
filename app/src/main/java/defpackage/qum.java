package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qum implements Comparable {
    final uzo a;
    final File b;
    final qum c;
    final int d;
    final boolean e;
    final String f;
    long g;

    public qum(uzo uzoVar, File file) {
        this.g = 0L;
        this.a = uzoVar;
        this.b = file;
        this.c = null;
        this.d = 0;
        this.e = true;
        this.f = "";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qum qumVar = (qum) obj;
        int i = qumVar.d;
        int i2 = this.d;
        if (i2 != i) {
            return i2 >= i ? 1 : -1;
        }
        boolean z = this.e;
        return z != qumVar.e ? !z ? 1 : -1 : this.f.compareTo(qumVar.f);
    }

    public qum(qum qumVar, boolean z, String str) {
        this.g = 0L;
        this.a = qumVar.a;
        this.b = qumVar.b;
        this.c = qumVar;
        this.d = qumVar.d + 1;
        this.e = z;
        if (qumVar.d != 0) {
            str = qumVar.f + "/" + str;
        }
        this.f = str;
    }
}
