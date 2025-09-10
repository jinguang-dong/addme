package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggr extends owx implements ggw {
    private final hbj a;

    public ggr(hbj hbjVar, luv luvVar) {
        super(luvVar);
        this.a = hbjVar;
    }

    @Override // defpackage.owx
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return oxh.d(((ltt) obj).name());
    }

    @Override // defpackage.owx
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        return ltt.a(((oxh) obj).name());
    }

    public final /* synthetic */ oxh d(Integer num) {
        return num.intValue() == 30 ? oxh.FPS_30 : num.intValue() == 60 ? oxh.FPS_60 : num.intValue() == 0 ? oxh.FPS_AUTO : num.intValue() == 24 ? oxh.FPS_24 : (oxh) super.dL();
    }

    @Override // defpackage.owx, defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return (oxh) this.a.a(gym.b).map(new fiy(this, 8)).orElse((oxh) super.dL());
    }
}
