package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ugx implements uhd {
    private final uhe key;

    public ugx(uhe uheVar) {
        uheVar.getClass();
        this.key = uheVar;
    }

    @Override // defpackage.uhf
    public Object fold(Object obj, uiu uiuVar) {
        return ske.aF(this, obj, uiuVar);
    }

    @Override // defpackage.uhd, defpackage.uhf
    public uhd get(uhe uheVar) {
        return ske.aG(this, uheVar);
    }

    @Override // defpackage.uhd
    public uhe getKey() {
        return this.key;
    }

    @Override // defpackage.uhf
    public uhf minusKey(uhe uheVar) {
        return ske.aH(this, uheVar);
    }

    @Override // defpackage.uhf
    public uhf plus(uhf uhfVar) {
        return ske.aI(this, uhfVar);
    }
}
