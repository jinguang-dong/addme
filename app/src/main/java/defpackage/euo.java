package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euo implements evh, euq {
    private final Context a;
    private final /* synthetic */ int b;

    public euo(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.euq
    public final Class a() {
        int i = this.b;
        return i != 0 ? i != 1 ? InputStream.class : AssetFileDescriptor.class : Drawable.class;
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new eur(this.a, (euq) this, 0) : new eur(this.a, (euq) this, 0) : new eur(this.a, (euq) this, 0);
    }

    @Override // defpackage.euq
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            return i2 != 1 ? resources.openRawResource(i) : resources.openRawResourceFd(i);
        }
        Context context = this.a;
        return exw.a(context, context, i, theme);
    }

    @Override // defpackage.euq
    public final /* synthetic */ void d(Object obj) throws IOException {
        int i = this.b;
        if (i == 0) {
        } else if (i != 1) {
            ((InputStream) obj).close();
        } else {
            ((AssetFileDescriptor) obj).close();
        }
    }
}
