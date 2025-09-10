package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esl implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public esl(Object obj, Object obj2, int i) {
        this.b = i;
        this.a = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ert ertVar;
        int i = this.b;
        if (i == 0) {
            Object obj = this.c;
            synchronized (((ezt) obj).a()) {
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((eso) obj2).a.d((ezt) obj)) {
                        ((eso) obj2).j.d();
                        try {
                            ((ezt) obj).g(((eso) obj2).j, ((eso) obj2).l);
                            ((eso) this.a).h((ezt) this.c);
                        } finally {
                        }
                    }
                    ((eso) this.a).c();
                }
            }
            return;
        }
        if (i != 1) {
            kgp kgpVar = (kgp) this.a;
            syu syuVar = kgpVar.c;
            if (syuVar != null && !syuVar.isDone()) {
                kgpVar.c.cancel(false);
                kgpVar.c = null;
            }
            ((kgt) this.c).d();
            kgpVar.b.close();
            return;
        }
        Object obj3 = this.c;
        synchronized (((ezt) obj3).a()) {
            Object obj4 = this.a;
            synchronized (obj4) {
                if (((eso) obj4).a.d((ezt) obj3)) {
                    try {
                        ((ezt) obj3).d(((eso) obj4).h);
                    } finally {
                    }
                }
                ((eso) this.a).c();
            }
        }
    }
}
