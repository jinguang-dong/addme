package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvu implements cwf {
    private final cvt a;
    private final cwf b;

    public cvu(cvt cvtVar, cwf cwfVar) {
        this.a = cvtVar;
        this.b = cwfVar;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        switch (cwaVar.ordinal()) {
            case 0:
                this.a.onCreate(cwhVar);
                break;
            case 1:
                this.a.onStart(cwhVar);
                break;
            case 2:
                this.a.onResume(cwhVar);
                break;
            case 3:
                this.a.onPause(cwhVar);
                break;
            case 4:
                this.a.onStop(cwhVar);
                break;
            case 5:
                this.a.onDestroy(cwhVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new uet();
        }
        cwf cwfVar = this.b;
        if (cwfVar != null) {
            cwfVar.a(cwhVar, cwaVar);
        }
    }
}
