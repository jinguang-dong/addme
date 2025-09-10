package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vai extends ufm implements RandomAccess {
    public static final ukc c = new ukc();
    public final vaf[] a;
    public final int[] b;

    public vai(vaf[] vafVarArr, int[] iArr) {
        this.a = vafVarArr;
        this.b = iArr;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof vaf) {
            return super.contains((vaf) obj);
        }
        return false;
    }

    @Override // defpackage.ufm, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.ufm, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof vaf) {
            return super.indexOf((vaf) obj);
        }
        return -1;
    }

    @Override // defpackage.ufm, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof vaf) {
            return super.lastIndexOf((vaf) obj);
        }
        return -1;
    }
}
