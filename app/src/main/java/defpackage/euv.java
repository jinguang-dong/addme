package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euv implements euu {
    private final /* synthetic */ int a;

    public euv(int i) {
        this.a = i;
    }

    @Override // defpackage.euu
    public final Class a() {
        return this.a != 0 ? ParcelFileDescriptor.class : InputStream.class;
    }

    @Override // defpackage.euu
    public final /* synthetic */ Object b(File file) {
        return this.a != 0 ? ParcelFileDescriptor.open(file, 268435456) : new FileInputStream(file);
    }

    @Override // defpackage.euu
    public final /* synthetic */ void c(Object obj) throws IOException {
        if (this.a != 0) {
            ((ParcelFileDescriptor) obj).close();
        } else {
            ((InputStream) obj).close();
        }
    }
}
