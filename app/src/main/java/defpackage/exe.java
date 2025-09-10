package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exe implements exf {
    private final List a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public exe(ByteBuffer byteBuffer, List list, etl etlVar, int i) {
        this.b = i;
        this.d = byteBuffer;
        this.a = list;
        this.c = etlVar;
    }

    @Override // defpackage.exf
    public final int a() {
        int i = this.b;
        if (i == 0) {
            return eoy.g(this.a, ((erg) this.c).a(), (etl) this.d);
        }
        if (i != 1) {
            return eoy.d(this.a, new eqf((erj) this.c, (etl) this.d, 2));
        }
        ByteBuffer byteBufferB = fak.b((ByteBuffer) this.d);
        if (byteBufferB == null) {
            return -1;
        }
        return eoy.d(this.a, new eqf(byteBufferB, (etl) this.c, 1));
    }

    @Override // defpackage.exf
    public final Bitmap b(BitmapFactory.Options options) {
        int i = this.b;
        return i != 0 ? i != 1 ? BitmapFactory.decodeFileDescriptor(((erj) this.c).a().getFileDescriptor(), null, options) : eoy.j(new faj(fak.b((ByteBuffer) this.d)), options) : eoy.j(((erg) this.c).a(), options);
    }

    @Override // defpackage.exf
    public final ImageHeaderParser$ImageType c() {
        int i = this.b;
        if (i == 0) {
            return eoy.h(this.a, ((erg) this.c).a(), (etl) this.d);
        }
        if (i == 1) {
            return eoy.e(this.a, fak.b((ByteBuffer) this.d));
        }
        return eoy.f(this.a, new eqe((erj) this.c, (etl) this.d));
    }

    @Override // defpackage.exf
    public final void d() {
        if (this.b != 0) {
            return;
        }
        ((erg) this.c).a.a();
    }

    public exe(InputStream inputStream, List list, etl etlVar, int i) {
        this.b = i;
        eoz.k(etlVar);
        this.d = etlVar;
        eoz.k(list);
        this.a = list;
        this.c = new erg(inputStream, etlVar);
    }

    public exe(ParcelFileDescriptor parcelFileDescriptor, List list, etl etlVar, int i) {
        this.b = i;
        eoz.k(etlVar);
        this.d = etlVar;
        eoz.k(list);
        this.a = list;
        this.c = new erj(parcelFileDescriptor);
    }
}
