package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovv implements ovq {
    private final pbn a;

    public ovv(pbn pbnVar) {
        this.a = pbnVar;
    }

    @Override // defpackage.ovq
    public final void a(paq paqVar) {
        if (!(paqVar instanceof ovu)) {
            paqVar.close();
            return;
        }
        try {
            this.a.f(((ovu) paqVar).b());
            paqVar.close();
        } finally {
            this.a.g();
        }
    }

    @Override // defpackage.ovq
    public final void b(Iterable iterable) {
        try {
            this.a.f("Lifetime#close");
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((paq) it.next());
            }
        } finally {
            this.a.g();
        }
    }
}
