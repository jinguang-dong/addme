package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uhr extends uhn {
    public uhr(uhb uhbVar) {
        super(uhbVar);
        if (uhbVar != null && uhbVar.q() != uhg.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return uhg.a;
    }
}
