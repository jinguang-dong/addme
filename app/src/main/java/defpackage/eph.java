package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eph implements far {
    final /* synthetic */ eox a;
    final /* synthetic */ List b;
    private boolean c;

    public eph(eox eoxVar, List list) {
        this.a = eoxVar;
        this.b = list;
    }

    @Override // defpackage.far
    public final /* bridge */ /* synthetic */ Object a() throws Throwable {
        boolean z;
        List<GlideConfiguration> list;
        ete eteVar;
        etl etlVar;
        Context applicationContext;
        ejs ejsVar;
        irt irtVar;
        Resources resources;
        List listB;
        eyb eybVar;
        exs exsVar;
        eqo ewhVar;
        ewh ewhVar2;
        Context context;
        ContentResolver contentResolver;
        eph ephVar = this;
        if (ephVar.c) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        coh.j("Glide registry");
        ephVar.c = true;
        try {
            eox eoxVar = ephVar.a;
            list = ephVar.b;
            eteVar = eoxVar.a;
            etlVar = eoxVar.d;
            epa epaVar = eoxVar.b;
            applicationContext = epaVar.getApplicationContext();
            ejsVar = epaVar.g;
            irtVar = new irt();
            irtVar.i(new ewn());
            irtVar.i(new exb());
            resources = applicationContext.getResources();
            listB = irtVar.b();
            eybVar = new eyb(applicationContext, listB, eteVar, etlVar);
            exsVar = new exs(eteVar, new exp(2));
        } catch (Throwable th) {
            th = th;
        }
        try {
            ewx ewxVar = new ewx(irtVar.b(), resources.getDisplayMetrics(), eteVar, etlVar);
            if (ejsVar.d(eoy.class)) {
                try {
                    ewhVar = new ewh(2);
                    ewhVar2 = new ewh(0);
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    ephVar = this;
                    ephVar.c = z;
                    Trace.endSection();
                    throw th;
                }
            } else {
                ewhVar2 = new ewh(ewxVar, 1);
                ewhVar = new exk(ewxVar, etlVar, 0);
            }
            irtVar.h("Animation", InputStream.class, Drawable.class, new ewh(new jod(listB, etlVar), 5));
            irtVar.h("Animation", ByteBuffer.class, Drawable.class, new ewh(new jod(listB, etlVar), 4));
            exz exzVar = new exz(applicationContext);
            ewe eweVar = new ewe(etlVar);
            eyl eylVar = new eyl(1);
            eyo eyoVar = new eyo(1);
            ContentResolver contentResolver2 = applicationContext.getContentResolver();
            irtVar.d(ByteBuffer.class, new eul());
            irtVar.d(InputStream.class, new evn(etlVar));
            irtVar.h("Bitmap", ByteBuffer.class, Bitmap.class, ewhVar2);
            irtVar.h("Bitmap", InputStream.class, Bitmap.class, ewhVar);
            if (erj.d()) {
                contentResolver = contentResolver2;
                context = applicationContext;
                irtVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new ewh(ewxVar, 3));
            } else {
                context = applicationContext;
                contentResolver = contentResolver2;
            }
            irtVar.h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new exs(eteVar, new exp(1)));
            irtVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, exsVar);
            evs evsVar = evs.a;
            irtVar.g(Bitmap.class, Bitmap.class, evsVar);
            irtVar.h("Bitmap", Bitmap.class, Bitmap.class, new eya(1));
            irtVar.e(Bitmap.class, eweVar);
            irtVar.h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ewc(resources, ewhVar2));
            irtVar.h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ewc(resources, ewhVar));
            irtVar.h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ewc(resources, exsVar));
            irtVar.e(BitmapDrawable.class, new ewd(eteVar, eweVar));
            irtVar.h("Animation", InputStream.class, eyd.class, new eyk(listB, eybVar, etlVar));
            irtVar.h("Animation", ByteBuffer.class, eyd.class, eybVar);
            irtVar.e(eyd.class, new eye());
            irtVar.g(epu.class, epu.class, evsVar);
            irtVar.h("Bitmap", epu.class, Bitmap.class, new ewh(eteVar, 6));
            irtVar.f(Uri.class, Drawable.class, exzVar);
            irtVar.f(Uri.class, Bitmap.class, new exk(exzVar, eteVar, 1));
            irtVar.j(new ext());
            irtVar.g(File.class, ByteBuffer.class, new euk(2));
            irtVar.g(File.class, InputStream.class, new eus(new euv(0), 0));
            irtVar.f(File.class, File.class, new eya(2));
            irtVar.g(File.class, ParcelFileDescriptor.class, new eus(new euv(1), 0));
            irtVar.g(File.class, File.class, evsVar);
            irtVar.j(new erf(etlVar));
            if (erj.d()) {
                irtVar.j(new eri());
            }
            Context context2 = context;
            euo euoVar = new euo(context2, 2);
            euo euoVar2 = new euo(context2, 1);
            euo euoVar3 = new euo(context2, 0);
            irtVar.g(Integer.TYPE, InputStream.class, euoVar);
            irtVar.g(Integer.class, InputStream.class, euoVar);
            irtVar.g(Integer.TYPE, AssetFileDescriptor.class, euoVar2);
            irtVar.g(Integer.class, AssetFileDescriptor.class, euoVar2);
            irtVar.g(Integer.TYPE, Drawable.class, euoVar3);
            irtVar.g(Integer.class, Drawable.class, euoVar3);
            irtVar.g(Uri.class, InputStream.class, new eus(context2, 3));
            irtVar.g(Uri.class, AssetFileDescriptor.class, new eus(context2, 2));
            evm evmVar = new evm(resources, 3);
            evm evmVar2 = new evm(resources, 0);
            evm evmVar3 = new evm(resources, 2);
            irtVar.g(Integer.class, Uri.class, evmVar);
            irtVar.g(Integer.TYPE, Uri.class, evmVar);
            irtVar.g(Integer.class, AssetFileDescriptor.class, evmVar2);
            irtVar.g(Integer.TYPE, AssetFileDescriptor.class, evmVar2);
            irtVar.g(Integer.class, InputStream.class, evmVar3);
            irtVar.g(Integer.TYPE, InputStream.class, evmVar3);
            irtVar.g(String.class, InputStream.class, new eus(1, (byte[]) null));
            irtVar.g(Uri.class, InputStream.class, new eus(1, (byte[]) null));
            irtVar.g(String.class, InputStream.class, new euk(5));
            irtVar.g(String.class, ParcelFileDescriptor.class, new euk(4));
            irtVar.g(String.class, AssetFileDescriptor.class, new euk(3));
            irtVar.g(Uri.class, InputStream.class, new eug(context2.getAssets(), 0));
            irtVar.g(Uri.class, AssetFileDescriptor.class, new eug(context2.getAssets(), 1));
            irtVar.g(Uri.class, InputStream.class, new evm(context2, 5));
            irtVar.g(Uri.class, InputStream.class, new evm(context2, 6));
            irtVar.g(Uri.class, InputStream.class, new evv(context2, InputStream.class));
            irtVar.g(Uri.class, ParcelFileDescriptor.class, new evv(context2, ParcelFileDescriptor.class));
            ContentResolver contentResolver3 = contentResolver;
            irtVar.g(Uri.class, InputStream.class, new evp(contentResolver3, 2));
            irtVar.g(Uri.class, ParcelFileDescriptor.class, new evp(contentResolver3, 0));
            irtVar.g(Uri.class, AssetFileDescriptor.class, new evp(contentResolver3, 1));
            irtVar.g(Uri.class, InputStream.class, new evs(0));
            irtVar.g(URL.class, InputStream.class, new evs(2));
            irtVar.g(Uri.class, File.class, new evm(context2, 1));
            irtVar.g(eux.class, InputStream.class, new evm(4));
            irtVar.g(byte[].class, ByteBuffer.class, new euk(1));
            irtVar.g(byte[].class, InputStream.class, new euk(0));
            irtVar.g(Uri.class, Uri.class, evsVar);
            irtVar.g(Drawable.class, Drawable.class, evsVar);
            irtVar.f(Drawable.class, Drawable.class, new eya(0));
            irtVar.k(Bitmap.class, BitmapDrawable.class, new eyl(resources, 0));
            irtVar.k(Bitmap.class, byte[].class, eylVar);
            irtVar.k(Drawable.class, byte[].class, new eym(eteVar, eylVar, eyoVar));
            irtVar.k(eyd.class, byte[].class, eyoVar);
            exs exsVar2 = new exs(eteVar, new exp(0));
            irtVar.f(ByteBuffer.class, Bitmap.class, exsVar2);
            irtVar.f(ByteBuffer.class, BitmapDrawable.class, new ewc(resources, exsVar2));
            for (GlideConfiguration glideConfiguration : list) {
            }
            this.c = false;
            Trace.endSection();
            return irtVar;
        } catch (Throwable th3) {
            th = th3;
            ephVar = this;
            z = false;
            ephVar.c = z;
            Trace.endSection();
            throw th;
        }
    }
}
