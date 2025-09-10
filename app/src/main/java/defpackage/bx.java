package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bx extends no {
    final /* synthetic */ ch a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(ch chVar) {
        super(false);
        this.a = chVar;
    }

    @Override // defpackage.no
    public final void a() {
        if (ch.X(3)) {
            Objects.toString(this.a);
        }
        ch chVar = this.a;
        if (ch.X(3)) {
            Objects.toString(chVar.f);
        }
        ai aiVar = chVar.f;
        if (aiVar != null) {
            aiVar.b = false;
            aiVar.b();
            ai aiVar2 = chVar.f;
            av avVar = new av(chVar, 8);
            if (aiVar2.t == null) {
                aiVar2.t = new ArrayList();
            }
            aiVar2.t.add(avVar);
            chVar.f.h();
            chVar.g = true;
            chVar.ah(true);
            chVar.I();
            chVar.g = false;
            chVar.f = null;
        }
    }

    @Override // defpackage.no
    public final void b() {
        int i;
        if (ch.X(3)) {
            Objects.toString(this.a);
        }
        ch chVar = this.a;
        chVar.g = true;
        chVar.ah(true);
        chVar.g = false;
        if (chVar.f == null) {
            if (chVar.h.b) {
                chVar.ab();
                return;
            } else {
                chVar.e.d();
                return;
            }
        }
        if (!chVar.j.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(ch.ac(chVar.f));
            ArrayList arrayList = chVar.j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                cd cdVar = (cd) arrayList.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        cdVar.c();
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = chVar.f.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bm bmVar = ((cp) arrayList2.get(i3)).b;
            if (bmVar != null) {
                bmVar.s = false;
            }
        }
        for (dh dhVar : chVar.k(new ArrayList(Collections.singletonList(chVar.f)), 0, 1)) {
            List list = dhVar.c;
            dhVar.i(list);
            dhVar.e(list);
        }
        ArrayList arrayList3 = chVar.f.d;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bm bmVar2 = ((cp) arrayList3.get(i4)).b;
            if (bmVar2 != null && bmVar2.O == null) {
                chVar.j(bmVar2).d();
            }
        }
        chVar.f = null;
        chVar.S();
        if (ch.X(3)) {
            boolean z = chVar.h.b;
            Objects.toString(chVar);
        }
    }

    @Override // defpackage.no
    public final void c(na naVar) {
        if (ch.X(2)) {
            Objects.toString(this.a);
        }
        ch chVar = this.a;
        ai aiVar = chVar.f;
        if (aiVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(aiVar));
            for (dh dhVar : chVar.k(arrayList, 0, 1)) {
                if (ch.X(2)) {
                    float f = naVar.a;
                }
                List list = dhVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ske.bT(arrayList2, ((dg) it.next()).g);
                }
                List listBN = ske.bN(ske.bQ(arrayList2));
                int size = listBN.size();
                for (int i = 0; i < size; i++) {
                    de deVar = (de) listBN.get(i);
                    ViewGroup viewGroup = dhVar.a;
                    deVar.e(naVar);
                }
            }
            ArrayList arrayList3 = chVar.j;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((cd) arrayList3.get(i2)).d();
            }
        }
    }

    @Override // defpackage.no
    public final void d() {
        if (ch.X(3)) {
            Objects.toString(this.a);
        }
        ch chVar = this.a;
        chVar.F();
        chVar.G(new cg(chVar), false);
    }
}
