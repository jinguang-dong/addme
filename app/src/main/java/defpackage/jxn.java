package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxn implements pau {
    final /* synthetic */ Object a;
    private boolean b = true;
    private final /* synthetic */ int c;

    public jxn(Object obj, int i) {
        this.c = i;
        this.a = obj;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            goi goiVar = (goi) obj;
            if (this.b) {
                this.b = false;
                return;
            }
            if (goiVar.c()) {
                ((jxp) this.a).l.a();
            } else {
                ((jxp) this.a).l.b();
            }
            ((jxp) this.a).e();
            return;
        }
        if (i == 1) {
            if (this.b) {
                this.b = false;
                return;
            }
            ((krj) this.a).m(true, krs.BEAUTIFICATION);
            return;
        }
        if (i != 2) {
            Object obj2 = this.a;
            Long l = (Long) obj;
            synchronized (((ozd) obj2).d) {
                if (this.b) {
                    this.b = false;
                    return;
                }
                ((ozd) obj2).a.compareAndSet(0L, l.longValue());
                ((ozd) obj2).b.offer(l);
                ((ozd) obj2).c();
                return;
            }
        }
        Object obj3 = this.a;
        Boolean bool = (Boolean) obj;
        synchronized (((jxv) obj3).d) {
            if (this.b) {
                this.b = false;
                return;
            }
            if (bool.booleanValue()) {
                ((jxv) obj3).e.a(false);
                ((jxv) obj3).g.h(nkw.VIDEO_NIGHT_SIGHT);
            } else {
                ((jxv) obj3).e.a(true);
            }
        }
    }
}
