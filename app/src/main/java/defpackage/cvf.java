package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvf extends ufm {
    public final List a;
    public final List b;
    public final cpo c;

    public cvf(cpo cpoVar, List list, List list2, yi yiVar) {
        if (yiVar.b != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (yiVar.b == 0) {
            a.bo("FloatList is empty.");
        }
        int i = 0;
        float fA = 0.0f;
        if (yiVar.a[0] != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (yiVar.b() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.c = cpoVar;
        this.b = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        while (i < size) {
            int i2 = i + 1;
            if (yiVar.a(i2) - yiVar.a(i) > 1.0E-4f) {
                arrayList.add(new cve(this, (cux) list2.get(i), fA, yiVar.a(i2)));
                fA = yiVar.a(i2);
            }
            i = i2;
        }
        cve cveVar = (cve) arrayList.get(ske.bk(arrayList));
        if (cveVar.b > 1.0f) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        cveVar.c = 1.0f;
        this.a = arrayList;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof cve) {
            return super.contains((cve) obj);
        }
        return false;
    }

    @Override // defpackage.ufm, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (cve) this.a.get(i);
    }

    @Override // defpackage.ufm, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof cve) {
            return super.indexOf((cve) obj);
        }
        return -1;
    }

    @Override // defpackage.ufm, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof cve) {
            return super.lastIndexOf((cve) obj);
        }
        return -1;
    }
}
