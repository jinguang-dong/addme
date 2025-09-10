package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erc extends eqs {
    public erc(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.eqv
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.eqs
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.eqs
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
