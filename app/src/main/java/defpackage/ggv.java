package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggv extends owx implements ggw {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggv(luv luvVar, int i) {
        super(luvVar);
        this.a = i;
    }

    @Override // defpackage.owx
    public final /* synthetic */ Object b(Object obj) {
        if (this.a != 0) {
            ltt lttVar = (ltt) obj;
            oxh oxhVar = oxh.FPS_AUTO;
            int iOrdinal = lttVar.ordinal();
            if (iOrdinal == 1) {
                return oxh.FPS_60C_24E;
            }
            if (iOrdinal == 2) {
                return oxh.FPS_60C_30E;
            }
            throw new IllegalArgumentException(String.format("%s is not a supported FPS option.", lttVar));
        }
        ltt lttVar2 = (ltt) obj;
        oxh oxhVar2 = oxh.FPS_AUTO;
        int iOrdinal2 = lttVar2.ordinal();
        if (iOrdinal2 == 1) {
            return oxh.FPS_24;
        }
        if (iOrdinal2 == 2) {
            return oxh.FPS_30;
        }
        if (iOrdinal2 == 3) {
            return oxh.FPS_60;
        }
        throw new IllegalArgumentException(String.format("%s is not a supported FPS option.", lttVar2));
    }

    @Override // defpackage.owx
    protected final /* synthetic */ Object c(Object obj) {
        if (this.a != 0) {
            oxh oxhVar = (oxh) obj;
            int iOrdinal = oxhVar.ordinal();
            if (iOrdinal == 4) {
                return ltt.FPS_24;
            }
            if (iOrdinal == 5) {
                return ltt.FPS_30;
            }
            throw new IllegalArgumentException(String.format("%s is not a supported camcorder capture rate.", oxhVar));
        }
        oxh oxhVar2 = (oxh) obj;
        int iOrdinal2 = oxhVar2.ordinal();
        if (iOrdinal2 == 1) {
            return ltt.FPS_24;
        }
        if (iOrdinal2 == 2) {
            return ltt.FPS_30;
        }
        if (iOrdinal2 == 3) {
            return ltt.FPS_60;
        }
        throw new IllegalArgumentException(String.format("%s is not a supported camcorder capture rate.", oxhVar2));
    }
}
