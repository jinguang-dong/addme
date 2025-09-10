package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyk implements eqo {
    private final List a;
    private final eqo b;
    private final etl c;

    public eyk(List list, eqo eqoVar, etl etlVar) {
        this.a = list;
        this.b = eqoVar;
        this.c = etlVar;
    }

    @Override // defpackage.eqo
    public final /* bridge */ /* synthetic */ esw a(Object obj, int i, int i2, eqm eqmVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, eqmVar);
    }

    @Override // defpackage.eqo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, eqm eqmVar) {
        return !((Boolean) eqmVar.b(eyj.b)).booleanValue() && eoy.h(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
