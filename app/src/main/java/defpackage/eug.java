package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eug implements evh, euf {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public eug(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.euf
    public final eqv a(AssetManager assetManager, String str) {
        return this.b != 0 ? new erc(assetManager, str) : new erk(assetManager, str);
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        return this.b != 0 ? new eur(this.a, this, 1) : new eur(this.a, this, 1);
    }
}
