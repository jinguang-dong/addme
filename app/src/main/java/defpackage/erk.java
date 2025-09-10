package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erk extends eqs {
    public erk(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.eqv
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.eqs
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.eqs
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
