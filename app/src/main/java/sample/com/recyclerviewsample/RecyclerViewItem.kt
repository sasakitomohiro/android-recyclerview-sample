package sample.com.recyclerviewsample

import com.xwray.groupie.databinding.BindableItem
import sample.com.recyclerviewsample.databinding.ItemRecyclerviewBinding

class RecyclerViewItem(val text: String) : BindableItem<ItemRecyclerviewBinding>() {
    override fun getLayout() = R.layout.item_recyclerview

    override fun bind(viewBinding: ItemRecyclerviewBinding, position: Int) {
        viewBinding.textView.text = text
    }
}